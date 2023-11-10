package structuraldesignpatterns.decorator;

public class Main {
    public static void main(String[] args)
    {
        Dessert dessert=new Vanillacone(
                            new Vanillacone(
                                new ChocoScoop(
                                    new Orangecone())));
        System.out.println(dessert.getcost());
        System.out.println(dessert.getDescription());
    }
}
