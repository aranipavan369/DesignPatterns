package structuraldesignpatterns.decorator;

public class Orangecone implements Dessert{

//    private Dessert dessert;
//    public Orangecone(Dessert dessert)
//    {
//        this.dessert=dessert;
//    }
    @Override
    public int getcost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Orangecone, ";
    }
}
