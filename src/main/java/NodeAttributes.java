import enums.EnumValues;

public class NodeAttributes {
	private Object value;
	private EnumValues.NodeType type;
	
	
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
	

}

