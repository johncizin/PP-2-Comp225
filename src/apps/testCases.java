package apps;
/* 
 Instructions: 

 You must write 12 test cases [X]

3 for the enqueue [X]
3 for the dequeue [X]
2 each for the isEmpty, isFull, and toString operations [X]
Each test case will state which operation is to be performed and the state of the test queue prior to the execution of the operation. For the enqueue and dequeue, the test case will state the expected state  of the queue after the operation is executed. [X]

For all operations other than the enqueue, the test case will state the expected return value. [X]
 */
import adts.ArrayQ;
import exceptions.*;

public class testCases {
    public static void main(String[] args){
        //Case 1:
        System.out.println("\nTest Case 1: IsEmpty() method");
        ArrayQ<Integer> queue1 = new ArrayQ<>(5);
        System.out.println("Initial State: " + queue1.toString());
        System.out.println("Operation: isEmpty()");
        System.out.println("Expected Return Value: true");
        System.out.println("Actual Return Value: " + queue1.isEmpty() + "\n");

        //Case 2:
        System.out.println("Test Case 2: IsEmpty() method");
        ArrayQ<Integer> queue2 = new ArrayQ<>(5);
        try {
        queue2.enqueue(10);
        queue2.enqueue(234);
        queue2.enqueue(67);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue2.toString());
        System.out.println("Operation: isEmpty()");
        System.out.println("Expected Return Value: false");
        System.out.println("Actual Return Value: " + queue2.isEmpty() + "\n");

        //Case 3:
        System.out.println("Test Case 3: IsFull() method");
        ArrayQ<Integer> queue3 = new ArrayQ<>(3);
        try {
        queue3.enqueue(1);
        queue3.enqueue(2);
        queue3.enqueue(3);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue3.toString());
        System.out.println("Operation: isFull()");
        System.out.println("Expected Return Value: true");
        System.out.println("Actual Return Value: " + queue3.isFull() + "\n");

        //Case 4:
        System.out.println("Test Case 4: IsFull() method");
        ArrayQ<Integer> queue4 = new ArrayQ<>(5);
        try {
        queue4.enqueue(10);
        queue4.enqueue(20);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue4.toString());
        System.out.println("Operation: isFull()");
        System.out.println("Expected Return Value: false");
        System.out.println("Actual Return Value: " + queue4.isFull() + "\n");

        //Case 5:
        System.out.println("Test Case 5: enqueue() method");
        ArrayQ<Integer> queue5 = new ArrayQ<>(4);
        System.out.println("Initial State: " + queue5.toString());
        System.out.println("Operation: enqueue(5)");
        try {
            queue5.enqueue(5);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Actual State: " + queue5.toString() + "\n");

        //Case 6: 
        System.out.println("Test Case 6: enqueue() method");
        ArrayQ<Integer> queue6 = new ArrayQ<>(3);
          try {
            queue6.enqueue(1);
             queue6.enqueue(2);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
            
        System.out.println("Initial State: " + queue6.toString());
        System.out.println("Operation: enqueue(3)");
        try {
            queue6.enqueue(3);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Actual State: " + queue6.toString() + "\n");

        //Case 7:
        System.out.println("Test Case 7: enqueue() method");
        ArrayQ<Integer> queue7 = new ArrayQ<>(2);
        try {
            queue7.enqueue(1);
            queue7.enqueue(2);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue7.toString());
        System.out.println("Operation: enqueue(3)");
        System.out.println("Expected State: QueueFullException"); // wrote expected state for this one because there will be 
        try {
            queue7.enqueue(3);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n");

        //Case 8:
        System.out.println("Test Case 8: toString() method");
        ArrayQ<Integer> queue8 = new ArrayQ<>(3);
        System.out.println("Initial State: " + queue8.toString());
        System.out.println("Operation: toString()");
        System.out.println("Expected Return Value: []");
        System.out.println("Actual Return Value: " + queue8.toString() + "\n");

        //Case 9:
        System.out.println("Test Case 9: toString() method");
        ArrayQ<Integer> queue9 = new ArrayQ<>(4);
        try {
          queue9.enqueue(7);
          queue9.enqueue(14);
          queue9.enqueue(21);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue9.toString());
        System.out.println("Operation: toString()");
        System.out.println("Expected Return Value: [7, 14, 21]");
        System.out.println("Actual Return Value: " + queue9.toString() + "\n");

        //Case 10:
        System.out.println("Test Case 10: dequeue() method");
        ArrayQ<Integer> queue10 = new ArrayQ<>(3);
        try {
            queue10.enqueue(100);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue10.toString());
        System.out.println("Operation: dequeue()");
        System.out.println("Expected Return Value: 100");
        try {
            System.out.println("Actual Return Value: " + queue10.dequeue());
        } catch (QueueEmptyException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Expected State: []");
        System.out.println("Actual State: " + queue10.toString() + "\n");

           //Case 11:
        System.out.println("Test Case 11: dequeue() method");
        ArrayQ<Integer> queue11 = new ArrayQ<>(4);
        try {
            queue11.enqueue(10);
            queue11.enqueue(20);
            queue11.enqueue(30);
        } catch (QueueFullException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Initial State: " + queue11.toString());
        System.out.println("Operation: dequeue()");            
        System.out.println("Expected Return Value: 10");
        try {
            System.out.println("Actual Return Value: " + queue11.dequeue());
        } catch (QueueEmptyException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Expected State: [20, 30]");
        System.out.println("Actual State: " + queue11.toString() + "\n");

          //Case 12:
        System.out.println("Test Case 12: dequeue() method");
        ArrayQ<Integer> queue12 = new ArrayQ<>(2);
        System.out.println("Initial State: " + queue12.toString());
        System.out.println("Operation: dequeue()");
        System.out.println("Expected Return Value: QueueEmptyException");
        System.out.print("Actual Return Value: ");
        try{
          queue12.dequeue();
        } catch (QueueEmptyException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n");
    }
}
