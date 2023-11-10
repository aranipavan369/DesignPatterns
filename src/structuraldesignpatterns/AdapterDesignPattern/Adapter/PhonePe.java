package structuraldesignpatterns.AdapterDesignPattern.Adapter;

public class PhonePe {
    private BankAPIAdapter apiAdapter;

    public PhonePe(String bankname) throws Exception {
        this.apiAdapter=AdapterFactory.getAPIAdapter(bankname);
    }
    public void getBalance(){
        double balance = apiAdapter.getBalance("userBankAccountId");
        System.out.println("Balance is : " + balance);
    }

    public void addBankAccount(){

    }

    public void transferAmount(){

    }

}
