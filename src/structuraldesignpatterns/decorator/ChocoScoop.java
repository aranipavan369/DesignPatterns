package structuraldesignpatterns.decorator;

public class ChocoScoop implements Dessert{
    private Dessert dessert;
    public ChocoScoop(Dessert dessert)
    {
        this.dessert=dessert;
    }
    @Override
    public int getcost() {
        return dessert.getcost()+25;
    }

    @Override
    public String getDescription() {
        return dessert.getDescription()+"Chocoscoop, ";
    }
}
