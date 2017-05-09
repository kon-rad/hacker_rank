/*
 * HR 20 011117
 */
package person;

import static person.HairColor.*;

public class Person {

    HairColor hairColor = BLACK; 
    
    public Person() {
       // Java garbage collection
       // deletes memory and reuses the space for
       // something else
       // helps us not run out of memory
       //JVC abstract computer machine that allows computer 
       // to run java programs
       // 1. specification swhat is required?
       // 2. implementation 
       // 3. instance
    }
    
    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;
        
        peterParker.hairColor = PINK;
        
        System.out.println("Hair Color of Peter Paker " +
                peterParker.hairColor);
        System.out.println("Hair Color of spiderman " +
                spiderMan.hairColor);
        
    }
    
}
