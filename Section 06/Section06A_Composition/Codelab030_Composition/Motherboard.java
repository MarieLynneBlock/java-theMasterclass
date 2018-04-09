package Section06A_Composition.Codelab030_Composition;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlot;
    private String bios;

    // Constructor
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    // Methods
    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading.");
    }


    // Getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }

}
