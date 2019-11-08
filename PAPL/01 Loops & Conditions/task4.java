public class task4 {

    public static String task4(){
        boolean isTrue = true;
        String out = "x\ty\n";
        int x = 0;
        while(isTrue){
            if(x == 1){
                int y = -3 * x - 2;
                out += x + "\t" + y + "\n";
                isTrue = false;
            }
            else{
                x += 1;
            }
        }
        return out;
    }
}
