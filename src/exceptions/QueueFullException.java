package exceptions;

public class QueueFullException extends Exception {
    public QueueFullException() {
         super("Queue is empty");
     }
     public QueueFullException(String message) {
         super(message);
     }
}
