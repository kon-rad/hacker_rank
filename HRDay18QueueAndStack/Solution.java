/*
 * Created by Konrad Gnat
 * On: January 09, 2017 
 * Hacker Rank Challenge Day 18 Queues and Stacks
 * 
 * 
 */  

import java.io.*;
import java.util.*;
 
 public class Solution {
    // Write your code here.
    
    Deque<Character> stack;
    LinkedList queue;
    
    public Solution() {
        stack = new ArrayDeque<Character>();
        queue = new LinkedList();
    }
    
    // pushCharacter()
    public void pushCharacter(char c) {
        stack.push(c);
    }
    
    // enqueCharacter() 
    public void enqueueCharacter(char c) {
        queue.addLast(c);
    }
    
    // popCharacter()
    public char popCharacter() {
        return stack.pop();
    }
  
    // dequeCharacter()
    public char dequeueCharacter() {
        return (char) queue.remove(0);
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}

//Sample Input
// 
// racecar
// Sample Output
// 
// The word, racecar, is a palindrome.