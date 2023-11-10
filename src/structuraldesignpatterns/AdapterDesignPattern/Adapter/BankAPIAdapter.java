package structuraldesignpatterns.AdapterDesignPattern.Adapter;

public interface BankAPIAdapter {
    int getBalance(String userBankAccountId);
    boolean addBankAccount(String userName, String bankAccountNumber);
    boolean transfer(String fromUserName, String toUserName, int amount);
}
