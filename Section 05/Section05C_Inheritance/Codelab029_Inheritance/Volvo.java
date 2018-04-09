package Section05C_Inheritance.Codelab029_Inheritance;

public class Volvo extends Car {

    private int roadServiceMonths;

    public Volvo(int roadServiceMonths) {
        super("Volvo", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void changeSeatsPosition() {
        System.out.println("changes the seats position.");
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        // automatic gear box
        if (newVelocity == 0) {
            stop();                                             // stop not in CAR method because
            changeGear(1);                           // option to Automatic Gear boxes
        } else if (newVelocity > 0 && newVelocity <= 10) {      // is now specific for type of car
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {     // Can make new class to make automatic gear box
            changeGear(2);                           // available for more cars.
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }

}
