package exception;

public class ParserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public ParserException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {

		return "ParserException:" + errorMessage + "\n" + super.toString();
	}

}
