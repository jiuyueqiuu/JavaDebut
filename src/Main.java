import oldStuff.Fish;
import oldStuff.Hawk;

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

 Important note :
 In Java, overloaded methods can exist !
 That means, methods can share the same name but possess different parameters

 A class variable is declared inside a class, not in methods

 varargs = allow a method to accept a varying num of args.
 makes methods more flexible, Java pack the args into an array
 ... (ellipsis)

 Inheritance = One class inherits the attributes
 and methods from another class.

 Child <--- Parent <--- Grandparent
 See oldClasses.Cat, oldClasses.Dog <--- oldClasses.Animal <--- oldClasses.Organism


 super = Refers to the parent class (subclass <- superclass)
 Used in constructors and method overriding
 Calls the parent constructor to initialise attributes


 abstract = Used to define abstract classes and methods
 Abstraction is the process of hiding implementation details
 and showing only the essential features
 Abstract classes CANNOT be instantiated directly
 Can contain 'abstract' methods (which must be implemented)
 Can contain 'concrete' methods (which are inherited)
 (Basically, an abstract parent class with an abstract method
 means that its children classes must have that method as well)
 See Shape class in oldClasses


 Interface = a blueprint for a class that specifies a set of abstract methods
 that implementing classes MUST define
 Supports multiple inheritance-like behaviour

 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();


        scanner.close();

    }

}