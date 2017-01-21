/*
 *  Konrad Gnat
 *  011317
 *  HackerRank Day 22 Binary Search Tree
 *  Breath first search: A is root
 * finds out what is directly connected 
 * to A
 * Depth first search is the same idea
 *  talked about Heaps, min-Heaps
 * max-heap, binary search trees, 
 * path-finding algorithms
 * 
 */
package binarysearchtree;

// a tree interface implemented by 
// 1. a nonempty BST
// 2. Empty BST

public class BinarySearchTree {

    public static void main(String[] args) {
        // TODO code application logic here
                NonEmptyBST aTree = new NonEmptyBST(11);
        aTree.add(22);
        aTree.add(33);
        aTree.add(44);
        aTree.add(55);
        System.out.println(aTree);
        
    }
    
}
