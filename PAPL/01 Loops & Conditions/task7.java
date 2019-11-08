import java.util.Scanner;

public class task7 {

    public static String task7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line gradient: ");
        int m = sc.nextInt();
        System.out.print("Enter line intercept: ");
        int c = sc.nextInt();

        int x = 0;
        String out = "x\ty\n";
        boolean isTrue = true;
        while(isTrue){
            int y = m * x + c;
            if(x <= 10){
                out += x + "\t" + y + "\n";
                x += 1;
            }
            else{
                isTrue = false;
            }

        }
        return out;
    }
}
