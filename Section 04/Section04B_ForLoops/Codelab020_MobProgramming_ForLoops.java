package Section04B_ForLoops;

public class Codelab020_MobProgramming_ForLoops {

    public static void main(String[] args) {

        // Not flexible, "tedious" code:
        /*
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        ...
        */


        // Alternative:

        for (int i = 0; i <= 5; i++) {
            System.out.println("Loop " + i);
        }

        for (double interestRate = 2; interestRate <= 8; interestRate++) {
            System.out.println("Interest on 10,000 = " + String.format("%.2f", calculateInterest(10000, interestRate)));
            //String.format --> to reduce the amount of precision (000000001) after the decimal point.
        }

        System.out.println("***************************");

        for (double interestRate = 8; interestRate >= 2; interestRate--) {
            System.out.println("Interest on 10,000 = " + String.format("%.2f", calculateInterest(10000, interestRate)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
