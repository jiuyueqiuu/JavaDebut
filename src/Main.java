import java.util.Scanner;
import java.util.Random;

// ternary operator :
// variable = (condition) ? ifTrue : if False;
// Exemple : String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);



    }
}