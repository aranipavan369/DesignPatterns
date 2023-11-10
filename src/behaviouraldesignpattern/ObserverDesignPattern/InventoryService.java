package behaviouraldesignpattern.ObserverDesignPattern;

public class InventoryService implements OrderPlacedSubcriber{
    @Override
    public void onOrderPlacedaction() {
        System.out.println("inventory updated on order placed");
    }
}
