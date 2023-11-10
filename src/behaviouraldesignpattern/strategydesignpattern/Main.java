package behaviouraldesignpattern.strategydesignpattern;

public class Main {
    public static void main(String[] args)
    {
        GoogleMaps map=new GoogleMaps();
        map.findPath("kasi","kanyakumari",TravellingMode.BIKE);
        //Math.random();
    }
}
