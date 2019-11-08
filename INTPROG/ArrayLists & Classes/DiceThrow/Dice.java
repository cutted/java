import java.util.*;
import java.util.Random;

public class Dice {
    private ArrayList<Integer> number;

    public Dice(ArrayList<Integer> sides){
        this.number = sides;

    }
    public int diceThrow(){
        Random random = new Random();
        int roll = random.nextInt(6);
        return this.number.get(roll);
    }
}
