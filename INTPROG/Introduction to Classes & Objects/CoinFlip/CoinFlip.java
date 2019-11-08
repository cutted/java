import java.util.Random;

public class CoinFlip {
    public CoinFlip() {

    }

    public String flipCoin(){
        Random random = new Random();

        int coinflip = random.nextInt(2);

        if (coinflip == 0){
            return "heads";
        }
        return "tails";
    }
}
