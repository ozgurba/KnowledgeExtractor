parser grammar KnowExtParser;

options { tokenVocab=KnowExtLexer; }

// source: http://media.pragprog.com/titles/tpantlr2/code/examples/Cymbol.g4

/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */

file:   (functionDecl | varDecl)+ ;

varDecl
    :   typeType IDENTIFIER ('=' expr)? ';'
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

block:  '{' stat* '}' ;   // possibly empty statement block
stat:   block
    |   varDecl
    |   IF parExpr stat (ELSE stat)?
    |   RETURN expr? ';'
    |   expr '=' expr ';' // assignment
    |   expr ';'          // func call
    | varDecl ';'
    ;
    
parExpr
    : '(' expr ')'
    ;

expr:   primary
	|	IDENTIFIER '(' exprList? ')'    // func call like f(), f(x), f(1,2)
    |   IDENTIFIER '[' expr ']'         // array index like a[i], a[i][j]
    |   '-' expr                // unary minus
    |   '!' expr                // boolean not
    |   expr '*' expr
    |   expr ('+'|'-') expr
    |   expr '==' expr          // equality comparison (lowest priority op)
    |   IDENTIFIER                      // variable reference
    |   '(' expr ')'
    ;
    
primary
    : '(' expr ')'
    | literal
    | IDENTIFIER
;
exprList : expr (',' expr)* ;   // arg list

typeType
    : (complexType | primitiveType) ('[' ']')*
    ;
    
literal
    : DECIMAL_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
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

























