public class task2 {

    public String outputFor(){
        String out = "x\ty\n";
        for(int i = 0; i <= 10; i++){
            int x = i;
            int y = 2 * x - 1;
            out += x + "\t" + y + "\n";
        }
        return out;
    }

    public String outputWhile(){
        int x = 0;
        String out = "x\ty\n";
        while(x <= 10){
            int y = 2 * x - 1;
            out += x + "\t" + y + "\n";
            x += 1;
        }
        return out;
    }
}
