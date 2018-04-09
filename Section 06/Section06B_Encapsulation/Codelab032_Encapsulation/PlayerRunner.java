package Section06B_Encapsulation.Codelab032_Encapsulation;

public class PlayerRunner {

    public static void main(String[] args) {

        Player player = new Player("Zorf", 50, "Axe");
        System.out.println("Initial health is " + player.getHealth());
    }

}
