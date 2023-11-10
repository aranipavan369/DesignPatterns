package structuraldesignpatterns.decorator;

public class Vanillacone implements Dessert{

    private Dessert dessert;
    public Vanillacone(Dessert dessert)
    {
        this.dessert=dessert;
    }
    @Override
    public int getcost() {
        return dessert.getcost()+100;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()+"Vanillacone, ";
    }
}
