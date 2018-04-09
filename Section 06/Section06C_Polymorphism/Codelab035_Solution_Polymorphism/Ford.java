package Section06C_Polymorphism.Codelab035_Solution_Polymorphism;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> start";
    }

    @Override
    public String accelerate() {
        return "Ford --> accelerate";
    }

    @Override
    public String brake() {
        return "Ford --> brake";
    }

}
