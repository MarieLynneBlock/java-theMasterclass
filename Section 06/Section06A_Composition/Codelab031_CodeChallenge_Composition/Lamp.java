package Section06A_Composition.Codelab031_CodeChallenge_Composition;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }


    // Methods
    public void turnOn() {
        System.out.println("Turned the lamp on");
    }


    // Getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

}
