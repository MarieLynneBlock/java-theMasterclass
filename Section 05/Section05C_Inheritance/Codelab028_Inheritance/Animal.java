package Section05C_Inheritance.Codelab028_Inheritance;

public class Animal {

    // fields (state)
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    int speed;

    // Constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("is eating! Om nom nom!");
    }

    public void move(int speed) {
        this.speed = speed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
