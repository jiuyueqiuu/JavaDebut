import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        boolean coin;

        coin = random.nextBoolean();

        if(coin) {
            System.out.println("HEADS !");
        }
        else  {
            System.out.println("TAILS !");
        }
    }
}