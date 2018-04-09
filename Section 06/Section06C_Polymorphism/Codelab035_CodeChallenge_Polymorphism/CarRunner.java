package Section06C_Polymorphism.Codelab035_CodeChallenge_Polymorphism;

public class CarRunner {

    public static void main(String[] args) {

        Car qashquai = new Qashqai("Qashquai", 8);
        qashquai.startEngine();
        qashquai.accelerate();
        qashquai.brake();

        Car fiesta = new Fiesta("Fiesta", 4);
        fiesta.startEngine();
        fiesta.accelerate();
        fiesta.brake();
    }

}
