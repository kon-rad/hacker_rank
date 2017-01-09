/*
 * 010917
 */
package Queuey;
import java.util.LinkedList;

/**
 * youtube tutorial with Kathryn Hodge
 */
public class Queuey {

    LinkedList queue;
    
    // Making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }
    
    public boolean isEmpty() {
      return queue.isEmpty(); 
    }
    
    // Returns size
    public int size() {
        return queue.size();
    }
    
    // Enquing an item
    public void enqueue(int n) {
        queue.addLast(n);
    }
    
    // Dequeuing an item
    public int dequeue() {
        return (int) queue.remove(0);
    }
    
    // Peek at the first item
    public int peek() {
        return (int) queue.get(0);
    }
    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(6);
        numberQueue.enqueue(70);
        System.out.println("First out " + numberQueue.dequeue());
        System.out.println("Second out " + numberQueue.dequeue());
        System.out.println("Third out  " + numberQueue.dequeue());
        
    }
    
}
