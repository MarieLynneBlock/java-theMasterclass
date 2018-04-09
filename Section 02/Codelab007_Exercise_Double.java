public class Codelab007_Exercise_Double {

    public static void main(String[] args) {

        /*
        EXERCISE:
            Convert a given number of pounds to kilogram
            1. Create a variable to store the number of pounds
            2. Calculate the number of Kilograms of the number above and store in a veriable
            3. Print out the result.

        NOTES:
            1 pound = 0.45359237 kg
        */


        double pounds = 200d;

        double kilograms = pounds * 0.45359237d;
        System.out.println("kilograms = " + kilograms);
    }

}
