import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        List<String> names = new ArrayList<String>();
        Pattern p = Pattern.compile("@gmail.com$");
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if(m.find()){
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for(int j = 0; j < names.size();j++){
            System.out.println(names.get(j));
        }
    }

}
