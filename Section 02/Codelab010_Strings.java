import java.lang.String;

public class Codelab010_Strings {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "44.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LAstString is equal to " + lastString);

        double doubleNumber = 10.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }

}
