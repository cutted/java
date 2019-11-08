public class task3 {

    public String task3(){
        int x = 0;
        String out = "x\ty\n";
        while(x <= 10){
            int y = 2 * x - 1;
            if(y > 5){
                break;
            }
            else {
                out += x + "\t" + y + "\n";
                x += 1;
            }
        }
        return out;
    }
}
