package abstractfactory;

public class Main {
    public static void main(String[] args) {
        // I need the ski report to the resort, so I can go snowboarding!

        //location
        double latitude = 39.742043;
        double longitude = -104.991531;
        FactoryGenerator.SkiReportType type = FactoryGenerator.SkiReportType.FORECAST;

        //get the factory first, (ski report generator)
        AbstractSkiReportFactory factory = FactoryGenerator.getSkiReportGenerator(type); //2 factories

        SkiReport myNearestSkiForeCast = factory.getNearestSkiReport(latitude, longitude);

        System.out.println(myNearestSkiForeCast.getReport());


    }
}