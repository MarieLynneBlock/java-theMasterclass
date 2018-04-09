public class Codelab003_Variables {

    public static void main(String[] args) {

        System.out.println("Hello, first variables in Java!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastNumber = 1000 - myTotal;

        System.out.println(myFirstNumber);
        System.out.println(myTotal);

        System.out.println(1000 - myFirstNumber);
        System.out.println(myLastNumber);
    }

}

