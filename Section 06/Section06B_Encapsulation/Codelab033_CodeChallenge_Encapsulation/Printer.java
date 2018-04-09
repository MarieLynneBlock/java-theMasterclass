package Section06B_Encapsulation.Codelab033_CodeChallenge_Encapsulation;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private int duplexPrintedPages;
    private boolean duplexPrinter;

    // Constructor
    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    // Methods
    public void refillToner(int refill) {
        if (this.tonerLevel >= 100) {
            System.out.println("Toner level already on 100%. You can't refill this one.");
        } else if (this.tonerLevel < 100 && this.tonerLevel >= 0 && (this.tonerLevel + refill) < 100) {
            System.out.println("Toner level was: " + this.tonerLevel + ". You refilled it for " + refill + "%.");
            this.tonerLevel += refill;
            System.out.println("Toner level is now at: " + tonerLevel + "%.");
        } else {
            System.out.println("Something went wrong, check your toner!");
        }
    }

    public int printingPages(int pages) {
        if (this.tonerLevel < 1) {
            System.out.println("Can not print: refill ink, please!");
        }

        System.out.println("Printing in progress");

        if (duplexPrinter) {
            numberOfPagesPrinted = (pages /= 2) + (pages % 2);
            System.out.println("You printed " + numberOfPagesPrinted + " pages.");
        }

        tonerLevel = getTonerLevel() - pages;
        System.out.println("The new toner level is: " + tonerLevel + "%.");
        return numberOfPagesPrinted;
    }

    // Getters
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

}


/*
deleted this:

if (duplexPrinter) {
    if (numberOfPagesPrinted % 2 == 0) {
        duplexPrintedPages = numberOfPagesPrinted / 2;
  } else {
        duplexPrintedPages = (numberOfPagesPrinted / 2) + 1;
  }
}
System.out.println("You printed " + duplexPrintedPages + " pages.");
 */

