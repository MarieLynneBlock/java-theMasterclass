package Section06C_Polymorphism.Codelab035_CodeChallenge_Polymorphism;

public class Qashqai extends Car {

    public Qashqai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Qashqai starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Qashqai accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Qashqai brakes");
    }

}
