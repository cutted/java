public class task1 {

    // a = 5i + j
    private int outerloop;
    private int innerloop;
    private int answer;

    public task1(int i, int j){
        outerloop = i;
        innerloop = j;
        answer = (outerloop * 5) + innerloop;
    }

    public int getResult(){
        if(outerloop == 4 && innerloop > 0) {
            return 0;
        }
        return answer;
    }
}
