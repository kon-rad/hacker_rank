/*
 *  Konrad Gnat
 *  
 * 
 */
package runtimepractice;

import java.util.HashMap;

/**
 *
 * @author konradgnat
 */
public class RunTimePractice {
    
    public static int findNumsOfRepetitions(String s, char c) {
        // linear time; O(n) time
        int sum = 0; // 1
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n 
            if (s.charAt(i) == c) { // n 
                sum++; //n 
            }
        }
        return sum; // 1
    }
    
    public static int[] findNumsOfRepetitionsv1(String s, char[] c) {
        // Quadratic time: O(n * m) time
        int[] sums = new int[c.length]; // 1 time
        for (int i = 0; i < s.length(); i++) { // 1, n + 1 ( n is length of 
                //string, size of our input)
            for (int j = 0; j < c.length; j++) {  // n, n * m + 1, n * m 
                if (s.charAt(i) == c[j]) { // n * m 
                    sums[j] = sums[j] + 1; // n * m 
                }
            }
        }
        return sums; // 1
        
    }
    
    public static int[] findNumsOfRepetitionsv2(String s, char[] c) {
        // Goal is Optimal time is: O(n + n) ( string and character array are not guarenteed to be the same length
        // 
        int[] sums = new int[c.length]; // 1 time
        // use hash map to make it n time, map character to integer
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        
        for (int j = 0; j < c.length; j++) {
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("ablasdfew", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
        
        char[] a = {'a', 'b'};
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv1("abasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfew", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsv2("abasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewabasdlf awefavpaowenfowefjwoiepfjofivapjfvoapwejv awevfnwavionjefapcmjwemxmwaoeifjxawpomoefjxawpoeoejfxwpaoifjxfpwoeifjpxoiwqutvghriutuivercmeowijoeviteroituvneoritvnueroitvueoirovnervlasdfewablasdfew", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms");
    }
    
}

/*
* Complexities: 
* OCD -> constant, doesn't depend on input, best one
*
* O(log(n)) => logarithmic
* if you have a super long input, and log of that is 20 then it takes
* 20ms, its fast, this is second best
*
* Linear, Third best
*
* Quadratic, is last, O(n^2) Quadratic nested for loops
*  - for loops nested, n time ish anything inside the for loop
* 
*
*/