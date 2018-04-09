package Section05A_Classes.Codelab026_CodeChallenge_Classes;

import Section05A_Classes.Codelab026_CodeChallenge_Classes.BankAccount;


public class BankAccountRunner {

    public static void main(String[] args) {

        // testers
        /*
        double newBalance1 = doDeposit(1000, 500);
        System.out.println(newBalance1);

        double newBalance2 = doWithdrawal(200, 300);
        System.out.println(newBalance2);

        double newBalance3 = doWithdrawal(3000, 20);
        System.out.println(newBalance3);
        */


        // other test  --- this is why we make constructors
            /*
            BankAccount bobsAccount = new BankAccount();
            bobsAccount.setAccountNumber(5385902840L);
            bobsAccount.setBalance(0.00);
            bobsAccount.setCustomerName("Bob");
            bobsAccount.setEmailAddress("bob.bob@bob.bob");
            bobsAccount.setPhoneNumber("(049) 04 89 78");
            */

        BankAccount bobsAccount = new BankAccount(  5385902840L,
                                                    0.00,
                                                    "Bob",
                                                    "bob.bob@bob.bob",
                                                    "(049) 04 89 78");

        bobsAccount.doDeposit(3000);
        bobsAccount.doWithdrawal(500);

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
    }

}
