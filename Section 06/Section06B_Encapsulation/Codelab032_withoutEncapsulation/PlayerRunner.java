package Section06B_Encapsulation.Codelab032_withoutEncapsulation;

public class PlayerRunner {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Zorf";
        player.health = 20;
        player.weapon = "Sword;";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.heathRemaining());

        damage = 11;
        player.loseHealth(damage);
    }

}
