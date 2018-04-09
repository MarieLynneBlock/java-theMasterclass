package Section07A_Arrays;

public class Codelab038_Arrays {

    public static void main(String[] args) {

        // INITIALISATION
        // 1. (initialisation)
        int[] myArray1;
        myArray1 = new int[10];
        myArray1[5] = 50;           // saving on index 6
        System.out.println(myArray1[5]);

        /* Adding elements one by one = tedious code:
         *
         *  myArray1[0] = 45;
         *  myArray1[1] = 476;
         *  myArray1[2] = 54;
         *  etc.
         *
         */

        // 2. (initialisation)
        int[] myArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myArray2[0]);
        System.out.println(myArray2[6]);
        System.out.println(myArray2[8]);

        // 3. (initialisation)
        int[] myArray3 = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray3[i] = i * 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myArray3[i]);

        }

        System.out.println("************************");

        // non "fixed length"
        int[] myArray4 = new int[25];

        for (int i = 0; i < myArray4.length; i++) {
            myArray4[i] = i * 10;
        }

        for (int i = 0; i < myArray4.length; i++) {
            System.out.println("Element " + i + ", value is " + myArray4[i]);

        }


        // TYPES
        double[] myArray5 = new double[10];
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
