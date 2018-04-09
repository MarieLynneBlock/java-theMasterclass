package Section06A_Composition.Codelab030_Composition;

public class ComputerRunner {

    public static void main(String[] args) {

        // New Case
        Dimensions dimensions = new Dimensions(20, 20,5);
        Case computerCase = new Case("2208", "Dell", "240", dimensions);

        // New Monitor
        Monitor computerMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        /* *** nativeResolution: we only have to pass it to a method (don't need a variable for later on)
         * = creating instance of a class
         */

        // New Motherboard
        Motherboard computerMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // Build new Computer
        Computer newComputer = new Computer(computerCase, computerMonitor, computerMotherboard);
        newComputer.powerUp();
    }

}
