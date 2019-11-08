public class task4 {

    public String task4(){
        int x = 0;
        while(x <= 10){
            int y = 2 * x - 1;
            if(y == 5){
                int x2 = y - 1;
                if(x2 == 4){
                    String intersect = "(4,5) = true";
                    return intersect;
                }
                break;
            }
            else {
                x += 1;
            }
        }
        return "error";
    }
}
