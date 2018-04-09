package Section06B_Encapsulation.Codelab033_CodeChallenge_Encapsulation;

public class PrinterRunner {

    public static void main(String[] args) {

        Printer printer = new Printer(5, 0, true);

        printer.refillToner(90);
        printer.printingPages(4);
    }

}
