import java.util.Scanner;
import java.util.Random;

// ternary operator :
// variable = (condition) ? ifTrue : if False;
// Exemple : String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";



/**  Enhanced Switch (Java14 feature)
 * A replacement to many else if statements
 String day;
 System.out.print("Enter a day in the week : ");
 day = scanner.nextLine();

 switch (day) {
 case "Monday" -> System.out.println("It is a weekday :( ");
 case "Tuesday" -> System.out.println("It is a weekday :( ");
 case "Wednesday" -> System.out.println("It is a weekday :( ");
 case "Thursday" -> System.out.println("It is a weekday :( ");
 case "Friday" -> System.out.println("It is a weekday :( ");
 case "Saturday" -> System.out.println("It is a weekend :) ");
 case "Sunday" -> System.out.println("It is a weekend :) ");
 default -> System.out.println(day + " not exist lil bro");
 }


 OR

 switch (day) {
 case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
 System.out.println("It is a weekday :( ");
 case "Saturday", "Sunday" ->
 System.out.println("It is a weekend :) ");
 default -> System.out.println(day + " not exist lil bro");
 }


 The logical operators :

 && = AND
 || = OR
 ! = NOT

 */

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNum = rand.nextInt(0, 11);

        do {
            System.out.println("Guess a number between 1 and 10 : ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNum) {
                System.out.println("TOO HIGH");
            }
            else if (guess < randomNum) {
                System.out.println("TOO LOW");
            }
            else {
                System.out.println("YOU ARE GOOD ! Correct ! The number was " + randomNum);
                System.out.println("# of attempts : " + attempts);
            }
        } while (guess != randomNum);

        System.out.println("You have won");


        scanner.close();
    }
}