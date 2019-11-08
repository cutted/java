public class Main {
    public static void main(String[] args) {
        User ur = new User("Anon", "User", 896692, "C0056S");
        System.out.println(ur.uniEmail());
        System.out.println(ur.courseChange("B1039d"));
        System.out.println(ur.paymentPaid(true));
        // check to see if 'else' statement works
        System.out.println(ur.reEnroll(true));
        // checks the 'if' statement
        System.out.println(ur.withdraw(false));
        System.out.println(ur.reEnroll(true));
    }
}
