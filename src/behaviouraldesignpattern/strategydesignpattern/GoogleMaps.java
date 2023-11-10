package behaviouraldesignpattern.strategydesignpattern;

public class GoogleMaps {

    public void findPath(String source, String destination,TravellingMode mode){
        PathCalculator pathCalculator = PathcreationFactory.getpathcalculator(mode);
        pathCalculator.calculatedistance(source, destination);
    }
}
