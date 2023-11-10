package structuraldesignpatterns.AdapterDesignPattern.Adapter;

import structuraldesignpatterns.AdapterDesignPattern.thirdpartybank.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI;
    public YesBankAdapter()
    {
        this.yesBankAPI=new YesBankAPI();
    }
    @Override
    public int getBalance(String userBankAccountId) {
        return (int)(yesBankAPI.balance(userBankAccountId));
    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        return yesBankAPI.addaccount(userName,bankAccountNumber);
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        return yesBankAPI.moneytransfer(fromUserName,toUserName,amount*1f);
    }
}
