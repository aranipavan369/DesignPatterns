package structuraldesignpatterns.AdapterDesignPattern.Adapter;

import structuraldesignpatterns.AdapterDesignPattern.thirdpartybank.BankAccountDetails;
import structuraldesignpatterns.AdapterDesignPattern.thirdpartybank.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPIAdapter{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }
    @Override
    public int getBalance(String userBankAccountId) {
        float balance=iciciBankAPI.getbalance(userBankAccountId);
        return (int)(balance);
    }

    @Override
    public boolean addBankAccount(String userName, String bankAccountNumber) {
        String ifsc = " "; //write logic to get ifsc from accountNumber
        BankAccountDetails bankAccountDetails = new BankAccountDetails(userName, bankAccountNumber, ifsc);
        char result = iciciBankAPI.addaccount(bankAccountDetails);
        return result == 'Y';
    }

    @Override
    public boolean transfer(String fromUserName, String toUserName, int amount) {
        BankAccountDetails fromUser = new BankAccountDetails(fromUserName, "" , "");
        BankAccountDetails toUser = new BankAccountDetails(toUserName, "" , "");
        double amountTransfer = amount;
        char result = iciciBankAPI.transaction(fromUser, toUser, amountTransfer);
        return result == 'Y';
    }
}
