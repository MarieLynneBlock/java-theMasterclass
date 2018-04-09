package Section05C_Inheritance.Codelab028_Inheritance;

import Section05C_Inheritance.Codelab028_Inheritance.Animal;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " *Chew Chew*");
        super.eat();
    }

    public void walk() {
        super.move(10);
        System.out.println(getName() + " is walking and moving at " + speed + " speed.");
    }

    public void run() {
        super.move(15);
        System.out.println(getName() + " is running and moving at " + speed + " speed.");
    }

    private void moveLegs(int speed) {
        System.out.println(getName() + " is moving its legs.");
    }

    // @Override
    // public void move(int speed) {
    //    System.out.println(getName() + " is moving");
    //    moveLegs(speed);
    //    super.move(speed);
    // }

}
