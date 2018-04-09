package Section06A_Composition.Codelab031_CodeChallenge_Composition;

public class Wall {

    private String facingDirection;
    private String paintedColour;

    // Constructor
    public Wall(String facingDirection, String paintedColour) {
        this.facingDirection = facingDirection;
        this.paintedColour = paintedColour;
    }

    // Getters
    public String getFacingDirection() {
        return facingDirection;
    }

    public String getPaintedColour() {
        return paintedColour;
    }

}
