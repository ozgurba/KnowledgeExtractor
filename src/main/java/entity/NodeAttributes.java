package entity;

import entity.enums.EnumValues;

public class NodeAttributes {
	private Object value;
	private EnumValues.NodeType type;
	private String name;
	public static final String ANONYMOUS = "Anonymous";
	private EnumValues.ScopeType scope;

	public NodeAttributes() {
		setName(ANONYMOUS);
	}

	@Override
	public String toString() {
		return "NodeAttributes [value=" + value + ", type=" + type + "]";
	}

	public Object getValue() {
		return value;
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

}
