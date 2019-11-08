public class task3 {

    public static String task3(){
        boolean isTrue = true;
        int x = 0;
        String out = "x\ty\n";
        while(isTrue){
            int y = -3 * x - 2;
            out += x + "\t" + y + "\n";
            x += 1;
            if(x == 21){
                isTrue = false;
            }
        }
        return out;
    }
}
