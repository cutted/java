public class Book {

    private String title;
    private String author;
    private int pages;
    private String ISBN;
    private double price;
    private int copies;

    public Book(
            String title,
            String author,
            int pages,
            String ISBN,
            double price,
            int copies
    )
    {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.ISBN = ISBN;
        this.price = price;
        this.copies = copies;
    }

    // updates internal member variable
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    // checks whether there are enough books,
    // if so subtracts number of copies with input value.
    // true if sold, false if not sufficient books
    public boolean sellBook(int numberCopiesToSell){
        if (numberCopiesToSell >= this.copies) {
            this.copies -= numberCopiesToSell;
            return true;
        }
        return false;
    }

    public void restockBook(int newCopies){
        this.copies += newCopies;
    }
    // this is just lots of 'modules' condensed into single lines
    public String getTitle(){ return this.title;}
    public String getAuthor(){ return this.author;}
    public int getNmbrPages(){ return this.pages;}
    public String getISBN() { return this.ISBN;}
    public double getPrice() { return this.price;}
    public int getNmbrCopies() { return this.copies;}
}
