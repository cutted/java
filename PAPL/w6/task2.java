public class task2 {

    public static String task2(){
        int x = 0;
        String out = "x\ty\n";
        while(x <= 20){
            int y = -3 * x - 2;
            out += x + "\t" + y + "\n";
            x += 1;
        }
        return out;
    }
}
