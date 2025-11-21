package oldClasses;

public class Motor {

    String make;
    String model;
    int year;
    String colour;

    Motor (String make, String model, int year, String colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return this.make + " " + this.model + " " + this.year + " " + this.colour;
    }

}
