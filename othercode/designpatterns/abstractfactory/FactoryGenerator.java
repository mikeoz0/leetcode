package abstractfactory;

public class FactoryGenerator {
    public static AbstractSkiReportFactory getSkiReportGenerator(String type){
        if (type.equalsIgnoreCase("forecast")) {
            return new SkiWeatherForcastFactory();
        } else if (type.equalsIgnoreCase("snow_report")){
            return new SkiConditionsFactory();
        }
        throw new IllegalArgumentException("cannot find ski report factory");
    }
}
