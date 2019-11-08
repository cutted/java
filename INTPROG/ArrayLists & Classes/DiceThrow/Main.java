import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> sides = new ArrayList<Integer>(
                Arrays.asList(1,2,3,4,5,6)
        );
        Dice di = new Dice(sides);
        for(int i = 0; i < 1; i++) {
            System.out.println(di.diceThrow());
        }
    }
}
