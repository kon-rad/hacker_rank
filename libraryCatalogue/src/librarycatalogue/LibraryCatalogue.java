/*
 * 
 */
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author konradgnat
 */
public class LibraryCatalogue {

    // Properties/Fields/Global Variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLatefee = 0.50;
    double feePerLateDay = 1.00;
    
    
    // Constructors
    public LibraryCatalogue(Map<String,Book> collection) {
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod,
            double itialLatefee, double perLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLatefee = itialLatefee;
        this.feePerLateDay = perLateDay;
    }
    
    // Getters
    public int getCurrentDay() {
        return this.currentDay;
    }
    public Map<String,Book> getBookCollection() {
        return this.bookCollection;
    }
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }
    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }
    public double getInitialLatefee() {
        return this.initialLatefee;
    }
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    // Setters
    public void nextDay() {
        currentDay++;
    }
    public void setDay(int day) {
        currentDay = day;
    }
    
    
    // Instance Methods
    
    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day " 
                + (getCurrentDay() + getLengthOfCheckoutPeriod()) + ". " );
        }
    }
    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLatefee() 
                    + daysLate * getFeePerLateDay()) + " becaue your book is " 
                    + daysLate + " days voerdue."); 
        } else {
            System.out.println("Book returned, thank you!");
        }
        book.setIsCheckedOut(false, -1);
    }
    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry. " + book.getTitle() + "is already checked out." 
            + "It should be back on day " + (book.getDayCheckedOut() 
                    + getLengthOfCheckoutPeriod()) +  ".");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Book> bookCollection =  new HashMap<String,Book>();
        Book harry = new Book("harry Potter", 2352, 9999999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
    
}
