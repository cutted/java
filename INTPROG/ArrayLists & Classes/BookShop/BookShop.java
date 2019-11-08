import java.util.*;

public class BookShop {
    private ArrayList<Book> books;

    public BookShop(){
        this.books = new ArrayList<Book>();
    }

    public void add (
            // states the type of data
            String title,
            String author,
            int pages,
            String ISBN,
            double price,
            int copies
    )
    {
        // book details being added to the ArrayList
        Book newBook = new Book (
                title,
                author,
                pages,
                ISBN,
                price,
                copies
        );

        books.add(newBook);
    }
    // changes the price of a book given the specified title
    // and returns it
    public void changePrice(String title, double newPrice){
        for(Book b : books){
            if (b.getTitle().equals(title)){
                b.changePrice(newPrice);
                return;
            }
        }
    }

    // gets the price of the book specified by title
    // if the book doesn't exist then it returns -1 (error)
    public double getprice(String title){
        for(Book b : books){
            if (b.getTitle().equals(title)){
                return b.getPrice();
            }
        }
        return -1;
    }

    public void sellBook (
            String title,
            String author,
            int pages,
            String ISBN,
            double price,
            int copies
    )
    {
        Book sellBook = new Book (
                title,
                author,
                pages,
                ISBN,
                price,
                copies
        );

        books.remove(sellBook);
    }

    public void sellBook2(String title){
        books.removeIf((b)->b.getTitle().equals(title));

    }
}
