package behaviouraldesignpattern.ObserverDesignPattern;

import creationaldesignpatterns.Prototype_and_Registry.Student;

public class Main {
    public static void main(String[] args)
    {
        InventoryService inventoryService=new InventoryService();
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Notificationmanager notificationmanager=new Notificationmanager();
        Amazon amazon=new Amazon();
        amazon.register(inventoryService);
        amazon.register(invoiceGenerator);
        amazon.register(notificationmanager);
        amazon.orderplaced();
        System.out.println("---------------------");
        amazon.deregister(notificationmanager);
        amazon.deregister(invoiceGenerator);
        amazon.orderplaced();
    }

}
