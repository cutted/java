public class Main {
    public static void main(String[] args) {
        BookShop bks = new BookShop();

        bks.add("How to dance like a Dad", "John Oldman", 200, "978-46-5678", 23.3, 500);
        bks.add("Simply The Best", "Tina Turner", 200, "978-11-3378", 2.3, 500);
        bks.add("Ghost of the Ring", "Toshio Hosokawa", 200, "978-23-5666", 214.3, 500);
        bks.add("Angels, Aliens & Robot Slaves", "Arthur B Blarke", 200, "978-46-5333", 13.78, 500);
        bks.add("Trouble in Toytown", "Bob Builder", 200, "978-42-5678", 23.3, 500);

        double price = bks.getprice("Ghost of the Ring");
        System.out.println(price);

        bks.changePrice("Ghost of the Ring", 100.78);

        price = bks.getprice("Ghost of the Ring");
        System.out.println(price);

        bks.sellBook("Angels, Aliens & Robot Slaves", "Arthur B Blarke", 200, "978-46-5333", 13.78, 500);

        double price2 = bks.getprice("Angels, Aliens & Robot Slaves");
        System.out.println(price2);

        bks.sellBook2("Trouble in Toytown");

        double priceT = bks.getprice("Trouble in Toytown");
        System.out.println(priceT);
    }
}
