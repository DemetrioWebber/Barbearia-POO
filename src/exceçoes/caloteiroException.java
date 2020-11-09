package exceçoes;

public class caloteiroException extends RuntimeException {
	private String message;

	public caloteiroException(String message) {
		
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
