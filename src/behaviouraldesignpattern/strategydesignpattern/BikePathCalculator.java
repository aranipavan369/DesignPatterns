package behaviouraldesignpattern.strategydesignpattern;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void calculatedistance(String source, String destination) {
        System.out.println("Mode is Bike travelling from "+source+"to"+destination);
    }
}
