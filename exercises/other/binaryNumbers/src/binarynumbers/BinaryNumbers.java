
/*
* Hack Rank Challenge Day # 10 
* Completed by Konrad Gnat
* On 12/19/16
* Task 
* Given a base-10 integer, n, convert it to binary (base-2). Then find and print 
* the base-10 integer denoting the maximum number of consecutive 1's in n's 
* binary representation.
* 
* 
*/
package binarynumbers;


import java.util.Arrays;


public class BinaryNumbers {

    public static void main(String[] args) {
        boolean foundOne = false;
        int onesCount = 0; 
        int onesOrder = 0;
        int decimal = 439;
        String binary = Integer.toString(decimal, 2);
        char[] digitsArray = binary.toCharArray();

         
        for (int i = 0; i < digitsArray.length; ++i) {
       
            if (digitsArray[i] == '1') {
                foundOne = true; 
            }
            if (digitsArray[i] == '1' && foundOne)
                onesCount += 1; 
            else if (digitsArray[i] == '0' && foundOne) {
                if (onesCount > onesOrder)
                    onesOrder = onesCount;
                onesCount = 0;
            } 
            if (digitsArray[i] == '1' && foundOne 
                && i == (digitsArray.length - 1)) {
                if (onesCount > onesOrder)
                    onesOrder = onesCount;
            }
             
        }
        System.out.println(onesOrder);
    }
    
}
