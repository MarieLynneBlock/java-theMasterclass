package Section06A_Composition.Codelab030_Composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    // Constructor
    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    // Methods
    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing pixel at " + x + " , " + y + " in colour " + colour + ".");
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

}
