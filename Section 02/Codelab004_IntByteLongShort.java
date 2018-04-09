public class Codelab004_IntByteLongShort {

    public static void main(String[] args) {

        // Int:
        // has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        // Since Java 7 option to put underscore to make large numbers more readable

        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);


        // Byte:
        // has a width of 8
        byte myByteValue = -128;

        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);


        // Short:
        // has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        // Long:
        // has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
    }

}
