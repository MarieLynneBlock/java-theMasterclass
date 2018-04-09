package Section06B_Encapsulation.Codelab032_Encapsulation;

public class Player {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    // Constructor
    public Player(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    // Methods
    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;

        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
        }
    }

    // Getter
    public int getHealth() {
        return hitPoints;
    }

}
