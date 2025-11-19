public class Car {
    String brand = "Audi";
    String model = "r8";
    int year = 2025;
    double price = 69999.99;
    boolean isRunning = false;

    void start () {
        isRunning = true;
        System.out.println("Car started");
    }
    void stop () {
        isRunning = false;
        System.out.println("Car stopped");
    }
}
