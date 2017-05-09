/*
 *  Konrad Gnat
 *  
 * 
 */
package solution;
import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Solution {

    static void levelOrder(Node root){
      //Write your code here
        
        if(root == null) 
            return;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        String result = "";
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            result = result + current.data + " ";
            //System.out.println(current.data + " ");
            //result += result + current.data + " ";
            if(current.left != null)
                queue.add(current.left);
            if(current.right != null)
                queue.add(current.right);
        }
            System.out.println(result);
      
    }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
    
}
