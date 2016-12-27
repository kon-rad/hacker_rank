/*
 * Kathryn Hodge Youtube tutorial; Linked Lists
 * Completed 12/27/16
 */
package nodetutorial;
import java.util.LinkedList;

/**
 *
 * @author konradgnat
 */
public class NodeTutorial {
    
    // Properties
    Node head;
    int count;
    
    // constructors
//    public NodeTutorial() {
//        head = null;
//        count = 0;
//    }
    
    public NodeTutorial(Node newHead) {
        head = newHead;
        count = 1;
    }
    
    // Methods
    
    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    
    //size
    public int size() {
        return count;
    }
    
    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }
    
    //remove
    public void remove() {
        // remove from the back of the list
        Node current = head;
        //solve problem of one head node>>> add if .size method
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    public static void main(String[] args) {
        //NodeTutorial<String> likedlist = new NodeTutorial<String>();
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        linkedlist.add("Alicey");
        System.out.println(linkedlist);
    }
    
}
