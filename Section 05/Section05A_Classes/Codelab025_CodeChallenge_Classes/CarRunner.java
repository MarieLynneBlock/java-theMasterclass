package Section05A_Classes.Codelab025_CodeChallenge_Classes;

import Section05A_Classes.Codelab025_CodeChallenge_Classes.Car;

public class CarRunner {

    public static void main(String[] args) {

    Car porsche = new Car();
    Car holden = new Car();

    porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());

    porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }

}
