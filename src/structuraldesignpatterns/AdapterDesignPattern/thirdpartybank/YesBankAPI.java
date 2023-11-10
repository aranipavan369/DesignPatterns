package structuraldesignpatterns.AdapterDesignPattern.thirdpartybank;

public class YesBankAPI {
    public double balance(String username)
    {
        return 100;
    }
    public boolean addaccount(String username,String accountnumber)
    {
        return true;
    }
    public boolean moneytransfer(String fromuserid,String touserid,float amount)
    {
        return true;
    }
}
