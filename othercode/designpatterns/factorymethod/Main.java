package factorymethod;

public class Main {
    public static void main(String[] args) {
        // I need the ski report to the resort, so I can go snowboarding!

        //location
        double latitude = 39.742043;
        double longitude = -104.991531;

        SkiConditions myNearestSkiReport = SkiReportFactory.getNearestSkiReport(latitude, longitude);

        System.out.println(myNearestSkiReport.getSnowReport());


    }
}