public class Codelab005_Exercise_PrimitiveDatatypes {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create an int variable and set it to any valid int number.
        // 4. Create a variable of the type long, and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short, plus the int.


        byte myByte = 127;
        short myShort = 10;
        int myInt = 1270;

        long myLong = 50000L + (myByte * 10) + myShort + myInt;

        System.out.println("longTotal = " + myLong);
    }

}
