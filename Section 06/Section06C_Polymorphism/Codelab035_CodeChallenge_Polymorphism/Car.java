package Section06C_Polymorphism.Codelab035_CodeChallenge_Polymorphism;

public class Car {

    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    // Methods
    public void startEngine() {
        if (engine = true) {
            System.out.println("Vroooom!");
        }
    }

    public void accelerate() {
        System.out.println("More VROOOOOOOOOM!");
    }

    public void brake() {
        System.out.println("Speed is 0.");
    }

    // Getters
    public String getName() {
        return name;
    }

}
