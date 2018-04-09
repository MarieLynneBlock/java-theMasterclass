package Section06B_Encapsulation.Codelab032_withoutEncapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int heathRemaining() {
        return this.health;
    }

}
