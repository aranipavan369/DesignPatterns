package behaviouraldesignpattern.strategydesignpattern;

public class CarPathCalculator implements PathCalculator{

    @Override
    public void calculatedistance(String source, String destination) {
        System.out.println("Mode is Car travelling from "+source+" to "+destination);
    }
}
