/*
 *  Konrad Gnat
 *  011217  
 * 
 */
package arraypractice;


public class ArrayPractice {
    
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       Integer[] intArray1 = {5, 2, 9, 1, 3};
       Integer[] intArray3 = new Integer[4];
       printArray(intArray1);
       Integer[] intArray2 = {5, 2, 9, 1, 3};
       String[] shoppingList = {"avocado", "notpad", "veggies", "rice"};
       
       printArray(intArray2);
       printArray(shoppingList); 
    }
    
}
