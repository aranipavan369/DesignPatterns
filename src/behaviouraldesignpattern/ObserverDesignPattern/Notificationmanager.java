package behaviouraldesignpattern.ObserverDesignPattern;

public class Notificationmanager implements OrderPlacedSubcriber{
    @Override
    public void onOrderPlacedaction() {
        System.out.println("notificatio sent on order placed");
    }
}
