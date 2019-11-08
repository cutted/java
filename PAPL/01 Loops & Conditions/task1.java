public class task1 {

    public static String task1(){
        String out = "x\ty\n";
        for(int x = 0; x <= 20; x++){
            int y = -3 * x - 2;
            out += x + "\t" + y + "\n";
        }
        return out;
    }
}
