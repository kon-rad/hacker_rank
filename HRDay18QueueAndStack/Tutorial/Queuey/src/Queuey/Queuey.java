/*
 * 010917
 */
package Queuey;
import java.util.LinkedList;
import java.util.Stack;

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
    public void enqueue(String n) {
        queue.addLast(n);
    }
    
    // Dequeuing an item
    public String dequeue() {
        return (String) queue.remove(0);
    }
    
    // Peek at the first item
    public String peek() {
        return (String) queue.get(0);
    }
    public static void main(String[] args) {
//        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(6);
//        numberQueue.enqueue(70);
//        System.out.println("First out " + numberQueue.dequeue());
//        System.out.println("peek at first " + numberQueue.peek());
//        System.out.println("Second out " + numberQueue.dequeue());
//        System.out.println("Third out  " + numberQueue.dequeue());
//        
//          Queuey str= new Queuey();
//          str.enqueue("hi");
//          str.enqueue("sup");
//          System.out.println(str.dequeue() + "!");
//          System.out.println(str.dequeue() + "?");

          Stack<String> stacky = new Stack<String>();
          stacky.push("there");
          stacky.push("hi");
          System.out.println(stacky.pop() + " . ");
          System.out.println(stacky.peek() + " that was peek");
          System.out.println(stacky.pop() + ". ");
          System.out.println("Size > " + stacky.size());

    }
    
}
