package Section04A_SwitchStatements;

public class Codelab016_MobProgramming_SwitchStatement {

    public static void main(String[] args) {

        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }


        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("It actually was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }


        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "february":
                System.out.println("Feb");
                break;

            case "march":
                System.out.println("Mar");
                break;

            case "april":
                System.out.println("Apr");
                break;

            case "may":
                System.out.println("May");
                break;

            // etc.
        }
    }

}
