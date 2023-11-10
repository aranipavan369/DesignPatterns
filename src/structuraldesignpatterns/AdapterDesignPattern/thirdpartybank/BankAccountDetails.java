package structuraldesignpatterns.AdapterDesignPattern.thirdpartybank;

public class BankAccountDetails {
    private String userName;
    private String accountNumber;
    private String ifsccode;

    public BankAccountDetails(String userName, String accountNumber, String ifsccode) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.ifsccode = ifsccode;
    }

    public BankAccountDetails()
    {

    }
}
