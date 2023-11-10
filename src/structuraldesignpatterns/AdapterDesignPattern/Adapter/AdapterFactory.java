package structuraldesignpatterns.AdapterDesignPattern.Adapter;

public class AdapterFactory {
    public static BankAPIAdapter getAPIAdapter(String bankname) throws Exception {

        return switch(bankname){
            case "ICICI"->new ICICIBankAdapter();
            case "YESBANK"->new YesBankAdapter();
            case "SBI"->new SBIBankAdapter();
            default -> throw new Exception("bank not available");
        };

    }
}
