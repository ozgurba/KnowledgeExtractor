parser grammar KnowExtParser;

options { tokenVocab=KnowExtLexer; }

file:   (functionDecl | varDecl)+ ;

varDecl
    :   typeType IDENTIFIER ('=' expression)? ';'
    ;

functionDecl
    :   typeTypeOrVoid IDENTIFIER '(' formalParameters? ')' block // "void f(int x) {...}"
    ;
    
typeTypeOrVoid
    : typeType
    | VOID
;
formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   typeType IDENTIFIER
    ;
	
block
    : '{' blockStatement* '}'
;
blockStatement
    : localVariableDeclaration ';'
    | statement
;

localVariableDeclaration
    : typeType variableDeclarators
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;
arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
;

literal
    : integerLiteral
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    ;


statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression ';'
    | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    | RETURN expression? ';'
    | BREAK IDENTIFIER? ';'
    | CONTINUE IDENTIFIER? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement
   /*TODO | TRY block (catchClause+ finallyBlock? | finallyBlock)
    | TRY resourceSpecification block catchClause* finallyBlock?
    | THROW expression ';'*/
;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

forControl
    : enhancedForControl
    | forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;

enhancedForControl
    : typeType variableDeclaratorId ':' expression
;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    ;

expression
    : primary
    | expression '[' expression ']'
    | expression '(' expressionList? ')'
    | NEW creator
    | methodCall
    | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | expression bop='?' expression ':' expression
    | expression UNION expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    ;
      
    
primary
    : '(' expression ')'
    | literal
    | IDENTIFIER
    ;

creator
    : nonWildcardTypeArguments createdName
    | createdName (arrayCreatorRest)
    ;

createdName
    : complexType
    | primitiveType
    ;

arrayCreatorRest
    : '[' (']' ('[' ']')* arrayInitializer | expression ']' ('[' expression ']')* ('[' ']')*)
    ;

nonWildcardTypeArguments
    : '<' typeList '>'
    ;

typeList
    : typeType (',' typeType)*
    ;

typeType
    : (complexType | primitiveType) ('[' ']')*
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    ;

complexType
	:	LIST
	|	TREE
	|	SET
	;	
arguments
    : '(' expressionList? ')'
;

