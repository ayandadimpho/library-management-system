package library;

/**
 * Represents an item in the library catalogue.
 *
 * TODO: Implement this class exactly as specified in the UML diagram
 *       and the behaviour specification in practical_instructions.md.
 */
public class LibraryItem {
    private String title;
    private  String isbn;
    private int year;
    private boolean isCheckedOut;




    private LibraryItem(String title, String isbn, int year) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut(boolean isCheckedOut) {
        if (isCheckedOut == true) {
            throw new IllegalStateException("Item is already checked out.");
        }
        this.isCheckedOut = true;
    }

    public void returnItem(boolean isCheckedOut) {
        if (isCheckedOut == false) {
            throw new IllegalStateException("Item is not currently checked out.");
        }
        this.isCheckedOut = false;
    }

    public void setYear(int year) {
        if (year < 1440 || year > year) {
            throw new IllegalArgumentException;
        }
        this.year = year;
    }

    public String getSummary() {
        Stringbuilder s = new Stringbuilder();
        s.append
    }

    // TODO: Getters — getTitle(), getIsbn(), getYear(), isCheckedOut()


    // TODO: checkOut()
    //   Sets isCheckedOut to true.
    //   Throws IllegalStateException("Item is already checked out.") if already true.


    // TODO: returnItem()
    //   Sets isCheckedOut to false.
    //   Throws IllegalStateException("Item is not currently checked out.") if already false.


    // TODO: setYear(int year)
    //   Throws IllegalArgumentException if year < 1440 or year > current year.


    // TODO: getSummary()
    //   Returns: "[title] ([year]) — ISBN: [isbn]"

}
