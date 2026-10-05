import java.util.Random;

public class FlipCoin{
    public static void main(String[] agrs){

        Random random = new Random();

        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }

    }
}
