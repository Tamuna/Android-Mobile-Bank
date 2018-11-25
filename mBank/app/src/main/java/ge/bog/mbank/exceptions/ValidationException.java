package ge.bog.mbank.exceptions;

public class ValidationException extends Exception {
    private String errorMessage = "";

    public ValidationException() {
        super();
    }

    public void appendErrorMessage(String errorMessage) {
        this.errorMessage += errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }
}
