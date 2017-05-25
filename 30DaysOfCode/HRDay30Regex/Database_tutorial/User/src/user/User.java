/*
 *  Konrad Gnat
 *  
 * 
 */
package user;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author konradgnat
 */
public class User {
    
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;
    
    public User(String customUserName, String customPassword, int customAge,
                Set<Integer> orderIDs){
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set a = new HashSet();
        a.add(1212);
        User konrad = new User("kmg", "hello world", 10, a);
        
        
    }
    
}
