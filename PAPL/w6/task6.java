import java.util.Scanner;

public class task6 {

    public static String task6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper value for y: ");
        int yLimit = sc.nextInt();

        int x = 0;
        String out = "x\ty\n";
        boolean isTrue = true;
        while(isTrue){
            int y = 3 * x + 5;
            if(y <= yLimit){
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
