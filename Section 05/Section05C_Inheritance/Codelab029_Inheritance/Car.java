package Section05C_Inheritance.Codelab029_Inheritance;

public class Car extends Vehicle {

    private int wheels;
    private int numberOfDoors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int numberOfDoors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.numberOfDoors = numberOfDoors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("The gear changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Velocity " + speed + ". direction " + direction + "." );
        moving(speed, direction);

    }

}
