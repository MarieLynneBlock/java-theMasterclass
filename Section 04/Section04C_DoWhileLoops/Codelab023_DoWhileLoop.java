package Section04C_DoWhileLoops;

public class Codelab023_DoWhileLoop {

    public static void main(String[] args) {

        // 1.
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        // 2.
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }

            System.out.println("Count value is " + count);
            count++;
        }
    }

}
