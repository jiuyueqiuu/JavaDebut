import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new  Scanner(System.in);

        String name;
        System.out.print("Enter your name: ");
        name = scanner.next();

        if(name.length() < 3) {
            System.out.println("Thy name is too short !");
        }
        else {
            System.out.println("Moin, " + name + " !");
        }

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("You are majeure !");
        }
        else if(age < 0) {
            System.out.println("You arent even born yet bro !");
        }
        else {
            System.out.println("You are mineure !");
        }


        boolean isEtudiant;
        System.out.print("Art thou a student ? (true/false) ");
        isEtudiant = scanner.nextBoolean();

        if(isEtudiant) {
            System.out.println("Very nice ! I wish you study well !");
        }
        else {
            System.out.println("Hmmmm... Perhaps thou art working...");
        }
    }
}