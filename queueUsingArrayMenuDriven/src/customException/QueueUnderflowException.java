package customException;


public class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String message) {
        super(message);
    }
}