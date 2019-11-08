public class task5 {

    public static String task5(){
        boolean isTrue = true;
        int x = 0;
        while(isTrue){
            int y1 = 3 * x - 8;
            int y2 = -4 * x + 6;
            if(y1 == y2){
                String intersect = "The equations intersect";
                isTrue = false;
                return intersect;
            }
            x += 1;
        }
        return "error";
    }
}
