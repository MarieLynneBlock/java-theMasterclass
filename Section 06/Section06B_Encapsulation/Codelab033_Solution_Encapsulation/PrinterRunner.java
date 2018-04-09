package Section06B_Encapsulation.Codelab033_Solution_Encapsulation;

public class PrinterRunner {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        // not accessing the variable directly = proper encapsulation --> via getter!

        int pagesPrinted = printer.printedPages(4);
        System.out.println("Pages printed was " + pagesPrinted
                + ". New total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printedPages(2);
        System.out.println("Pages printed was " + pagesPrinted
                + ". New total print count for printer = " + printer.getPagesPrinted());


        /*
         * initial page count = 0
         * Printing double sided
         * Pages printed was 2. New total print count for printer = 2
         * Printing double sided
         * Pages printed was 2. New total print count for printer = 4
         *
         * ---> wrong pages calculation :/
         */
    }

}
