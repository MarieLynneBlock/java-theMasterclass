package Section05B_Constructors.Codelab027_CodeChallenge_Constructors;

public class VIPCustomerRunner {

    public static void main(String[] args) {
        VIPCustomer VIP1 = new VIPCustomer();
        VIPCustomer VIP2 = new VIPCustomer("Bobby",5000.00);
        VIPCustomer VIP3 = new VIPCustomer("Bobette", 9000.50, "bobette@email.bob");

        // Test VIP1
        System.out.println("VIP1s Name is " + VIP1.getCustomersName());
        System.out.println("VIP1s Credit is " + VIP1.getCreditLimit());
        System.out.println("VIP1s email address is " + VIP1.getCustomersEmail());
        System.out.println("*****");

        // Test VIP2
        System.out.println("VIP2s Name is " + VIP2.getCustomersName());
        System.out.println("VIP2s Credit is " + VIP2.getCreditLimit());
        System.out.println(VIP2.getCustomersEmail());
        System.out.println("*****");

        // Test VIP3
        System.out.println("VIP2s Name is " + VIP3.getCustomersName());
        System.out.println("VIP2s Credit is " + VIP3.getCreditLimit());
        System.out.println("VIP2s email address is " + VIP3.getCustomersEmail());
        System.out.println("*****");
    }

}
