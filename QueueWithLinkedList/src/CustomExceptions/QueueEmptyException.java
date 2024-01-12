package CustomExceptions;

public class QueueEmptyException extends Exception {
    public QueueEmptyException(String message) {
        super(message);
    }
}
