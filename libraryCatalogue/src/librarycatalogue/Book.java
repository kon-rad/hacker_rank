
package librarycatalogue;


public class Book {
    
    // Properties, fields, global variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckOut;// weather or not it is check out;
    int dayCheckedOut = -1; 
    
    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        isCheckOut = false;
        
    }
    
    // Get methods, Instance Methods
    public String getTitle() {
        return this.title;
    }
    public int getPageCount() {
        return this.pageCount;
    }
    public int getISBN() {
        return this.ISBN;
    }
    public Boolean getIsCheckedOut() {
        return isCheckOut;
    }
    public int getDayCheckedOut() {
        return dayCheckedOut;
    }
    
    // Setters
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    
    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
