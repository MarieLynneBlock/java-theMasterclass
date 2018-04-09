package Section06C_Polymorphism.Codelab035_Solution_Polymorphism;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> start";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> brake";
    }

}

