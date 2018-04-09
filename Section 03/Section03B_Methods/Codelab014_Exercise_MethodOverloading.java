package Section03B_Methods;

public class Codelab014_Exercise_MethodOverloading {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(100);
        calcFeetAndInchesToCentimeters(0, 0);
        calcFeetAndInchesToCentimeters(0, 12);
        calcFeetAndInchesToCentimeters(2);
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet <= 0) || (inches <= 0 && inches <=12)) {
            System.out.println("Invalid feet or inches parameters!");
            return -1;
        }

        double centimeters = (feet * 30.48) + (inches * 2.54);
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters.");
        return centimeters;
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            System.out.println("Invalid inches parameter!");
            return -1;
        }

        double centimeters = (inches * 2.45);
        System.out.println(inches + " inches = " + centimeters + " centimeters.");
        return (inches * 2.54);
    }

}
