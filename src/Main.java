import java.util.Arrays;
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


 Important note :
 In Java, overloaded methods can exist !
 That means, methods can share the same name but possess different parameters

 A class variable is declared inside a class, not in methods

 varargs = allow a method to accept a varying num of args.
 makes methods more flexible, Java pack the args into an array
 ... (ellipsis)

 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many nums do you want ? ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        double avg = average(numbers);

        System.out.println("The average is " + avg);



        scanner.close();


    }

    static double average (double... nums) {
        double sum = 0;

        for (double num : nums) {
            sum += num;
        }
        return sum / nums.length;

    }
}