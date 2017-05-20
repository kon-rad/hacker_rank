/*
 *  Konrad Gnat
 *  
 * 
 */
package binarysearchtree;

import java.util.Random;

/**
 *
 * @author konradgnat
 */
public class Testers {
    
    // random integers
    public static int rndInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max-min) +1)+min;
    }
    
    // random binary search trees
    public static Tree rndTree(int count){
       if(count==0){
           return new EmptyBST();
       }  else {
           return rndTree(count - 1).add(rndInt(0, 50));
       }
    }
    
    public static void checkIsEmpty(Tree t) throws Exception {
        // if the tree t is an instance of EMptyBST --> isEmpty -> ture
        // if the tree t is an instance of NonEmpty BST t.isEmpty -> false
        if (t instanceof EmptyBST){
            if(!t.isEmpty()){
                throw new Exception("All is not good, the tree is an EmptyBST and it is  not empty");
            } 
        } else if (t instanceof NonEmptyBST){
            if(t.isEmpty()){
                throw new Exception("All is not good the tree is NonEmptyBSt and its empty");
            }
        }
    }
    
    public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
        int nT = (t.add(x)).cardinality();
        // 1. Either something was added --> adn the ardinality increased by one. 
        if(nT == (t.cardinality()+1)) {
            if(t.member(x)){
                throw new Exception("The cardinality increased by 1, but the ting "
                    + "that was added was alreadya member of the tree");
            }
        }
        // 2. or the thing that was added was already there and therefore not added
        // so cardinallity stayed the same
        else if (nT == t.cardinality()){
            if(!t.member(x)){
                throw new Exception("The cardinality didn't incrased by 1, but "
                    + "we added a new thing");
            }
        } else {
            throw new Exception("Something is wrong with our program");
        }
    }
    
}
