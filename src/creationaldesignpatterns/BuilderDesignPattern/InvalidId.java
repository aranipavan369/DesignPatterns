package creationaldesignpatterns.BuilderDesignPattern;

public class InvalidId extends RuntimeException{
    public InvalidId() {
    }

    public InvalidId(String message) {
        super(message);
    }

    public InvalidId(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidId(Throwable cause) {
        super(cause);
    }

    public InvalidId(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
