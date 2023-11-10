package behaviouraldesignpattern.ObserverDesignPattern;

public class InvoiceGenerator implements OrderPlacedSubcriber{
    @Override
    public void onOrderPlacedaction() {
        System.out.println("Invoice on orederplaced generated");
    }
}
