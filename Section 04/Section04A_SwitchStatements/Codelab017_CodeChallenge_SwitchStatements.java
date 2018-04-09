package Section04A_SwitchStatements;

public class Codelab017_CodeChallenge_SwitchStatements {

    public static void main(String[] args) {

        /*
         *
         * Create a switch statement using char
         * create a new char variable
         * create a switch statement testing for
         * A, B, C, D, or E
         * display a message if any of these are found
         *
         */

        char switchValue = 'G';

        switch (switchValue) {

            case 'A':
                System.out.println("It was A!");
                break;

            case 'B':
                System.out.println("It was B!");
                break;

            case 'C':
                System.out.println("It was C!");
                break;

            case 'D':
                System.out.println("It was D!");
                break;

            case 'E':
                System.out.println("It was E!");
                break;

            default:
                System.out.println("Not found!");
        }

        // OR:
        char switchValue2 = 'D';

        switch (switchValue2) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("It was " + switchValue2 + "!");
                break;

            default:
                System.out.println("Not found!");

        }
    }

}
