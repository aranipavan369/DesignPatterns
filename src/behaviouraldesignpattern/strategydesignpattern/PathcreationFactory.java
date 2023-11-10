package behaviouraldesignpattern.strategydesignpattern;

public class PathcreationFactory {
    public static PathCalculator getpathcalculator(TravellingMode mode)
    {
        return switch (mode){
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
