import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double converted_weight;
        String unit;
        System.out.print("Enter weight : ");
        weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Which unit are you starting with? (kgs/lbs) ");
        unit = scanner.nextLine();

        if(unit.equals("kgs")) {
            converted_weight = weight * 2.20462;
        } else {
            converted_weight = weight / 2.20462;
        }

        System.out.print("\nThe converted weight is : " + converted_weight);

        scanner.close();



    }
}