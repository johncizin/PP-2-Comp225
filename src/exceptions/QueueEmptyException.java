package exceptions;

public class QueueEmptyException extends Exception {
     public QueueEmptyException() {
         super("Queue is empty");
     }

    public QueueEmptyException(String message) {
         super(message);
     }
}
