package Section06A_Composition.Codelab030_Composition;

public class Computer {

    private Case computerCase;          // has-a relationship
    private Monitor monitor;
    private Motherboard motherboard;

    /*
     * Inheritance => can only inherit from one class at a time.
     * (you can only extend from one class)
     *
     * >< Composition: computer comprises of these 3 other classes
     */

    // Constructor
    public Computer(Case computerCase, Monitor monitor, Motherboard motherboard) {
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Getters
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    /* Getters can be deleted  -> access them directly
    in stead of .getComputerCase().pressPowerButton() ---> computerCase.pressPowerButton()
    private Case getComputerCase() {
        return computerCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
    */

}
