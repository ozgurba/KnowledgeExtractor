package entity;

import entity.enums.EnumValues;

public class NodeAttributes {
	private Object value;
	private EnumValues.NodeType type;
	private String name;
	public static final String ANONYMOUS = "Anonymous";
	private EnumValues.ScopeType scope;
	private int lineNumber;

	public NodeAttributes() {
		setName(ANONYMOUS);
	}

	public Object getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "NodeAttributes [value=" + value + ", type=" + type + ", name=" + name + ", scope=" + scope + "]";
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public NodeAttributes value(Object value) {
		this.setValue(value);
		return this;
	}

	public EnumValues.NodeType getType() {
		return type;
	}

	public void setType(EnumValues.NodeType type) {
		this.type = type;
	}

	public NodeAttributes type(EnumValues.NodeType type) {
		this.setType(type);
		return this;
	}

	public NodeAttributes name(String name) {
		this.setName(name);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnumValues.ScopeType getScope() {
		return scope;
	}

	public void setScope(EnumValues.ScopeType scope) {
		this.scope = scope;
	}

	public NodeAttributes scope(EnumValues.ScopeType scope) {
		setScope(scope);
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((scope == null) ? 0 : scope.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeAttributes other = (NodeAttributes) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (scope != other.scope)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public NodeAttributes lineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}

}
