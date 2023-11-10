package behaviouraldesignpattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubcriber> orderPlacedSubcriberList=new ArrayList<>();

    public void register(OrderPlacedSubcriber orderPlacedSubcriber)
    {
        orderPlacedSubcriberList.add(orderPlacedSubcriber);
    }
    public void deregister(OrderPlacedSubcriber orderPlacedSubcriber)
    {
        orderPlacedSubcriberList.remove(orderPlacedSubcriber);
    }
    public void orderplaced()
    {
        for (OrderPlacedSubcriber orderPlacedSubcriber:orderPlacedSubcriberList)
        {
            orderPlacedSubcriber.onOrderPlacedaction();
        }
    }

}
