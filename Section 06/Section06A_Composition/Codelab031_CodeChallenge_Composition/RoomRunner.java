package Section06A_Composition.Codelab031_CodeChallenge_Composition;

public class RoomRunner {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West", "blue");
        Wall wall2 = new Wall("East", "blue");
        Wall wall3 = new Wall("South", "blue");
        Wall wall4 = new Wall("North", "white");

        Ceiling ceiling = new Ceiling(2, "white");
        Bed bed = new Bed("Modern", 4, 1, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }

}
