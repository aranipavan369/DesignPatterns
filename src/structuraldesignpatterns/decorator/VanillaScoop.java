package structuraldesignpatterns.decorator;

public class VanillaScoop implements Dessert{

    private Dessert dessert;
    public VanillaScoop(Dessert dessert)
    {
        this.dessert=dessert;
    }
    @Override
    public int getcost() {
        return dessert.getcost()+50;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()+"Vanillascoop, ";
    }
}
