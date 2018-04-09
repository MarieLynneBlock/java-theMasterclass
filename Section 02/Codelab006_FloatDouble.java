public class Codelab006_FloatDouble {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5f;

        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        int mySecondIntValue = 5 / 2;
        float mySecondFloatValue = 5f / 3f;
        double mySecondDoubleValue = 5d / 3d;

        System.out.println("mySecondIntValue = " + mySecondIntValue);
        System.out.println("mySecondFloatValue = " + mySecondFloatValue);
        System.out.println("mySecondDoubleValue = " + mySecondDoubleValue);
    }

}
