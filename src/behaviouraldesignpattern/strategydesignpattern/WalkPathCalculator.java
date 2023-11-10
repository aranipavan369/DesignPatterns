package behaviouraldesignpattern.strategydesignpattern;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void calculatedistance(String source, String destination) {
        System.out.println("Mode is Walk travelling from "+source+"to"+destination);
    }
}
