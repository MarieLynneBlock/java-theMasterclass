package Section05B_Constructors.Codelab027_CodeChallenge_Constructors;

public class VIPCustomer {
    private String customersName;
    private double creditLimit;
    private String customersEmail;

    public VIPCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

    public VIPCustomer(String customersName, double creditLimit) {
        this(customersName, creditLimit, "unknown email address");
    }

    public VIPCustomer(String customersName, double creditLimit, String customersEmail) {
        this.customersName = customersName;
        this.creditLimit = creditLimit;
        this.customersEmail = customersEmail;
    }

    // Getters
    public String getCustomersName() {
        return customersName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomersEmail() {
        return customersEmail;
    }

}
