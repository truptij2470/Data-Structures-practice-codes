package customException;

public class QueueOverflowException extends Exception {
    public QueueOverflowException(String message) {
        super(message);
    }
}