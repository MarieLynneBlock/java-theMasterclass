package Section06C_Polymorphism.Codelab035_CodeChallenge_Polymorphism;

public class Fiesta extends Car {

    public Fiesta(String name, int cylinders) {
        super(name, cylinders);
    }


    @Override
    public void startEngine() {
        System.out.println("Fiesta starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Fiesta accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Fiesta brakes");
    }

}
