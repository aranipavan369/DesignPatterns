package structuraldesignpatterns.AdapterDesignPattern.thirdpartybank;

public class ICICIBankAPI{
    public float getbalance(String customerId)
    {
        return 100f;
    }
    public char addaccount(BankAccountDetails bankAccountDetails)
    {
        return 'y';
    }
    public char transaction(BankAccountDetails fromaccount,BankAccountDetails toaccount,double money)
    {
        return 'y';
    }
}
