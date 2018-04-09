package Section04C_DoWhileLoops;

public class Codelab024_CodeChallenge_DoWhileLoop {

    public static void main(String[] args) {

        /*
         *  1. Create method isEvenNumber (determine argument is an even number or not)
         *  1. return true if even, otherwise return false
         *
         *    EXTRA:
         *    2. Modify the code you've written
         *    - make it record total number of even numbers found and break once 5 are found
         *    at the end make it display the total even numbers found
         *
         */

        int number = 4;
        int finishNumber = 20;
        int count = 0;                                                  // 2

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            count++;                                                    // 2
            if (count >= 5)                                             // 2
                break;                                                  // 2
        }
        System.out.println("Total even numbers found = " + count);      // 2
    }


    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}
