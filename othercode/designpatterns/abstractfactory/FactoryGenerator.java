package abstractfactory;

public class FactoryGenerator {

    public enum SkiReportType {
        FORECAST, SNOW_REPORT
    }

    public static AbstractSkiReportFactory getSkiReportGenerator(SkiReportType skiReportType){
        switch (skiReportType) {
            case FORECAST:
                return new SkiWeatherForcastFactory();
            case SNOW_REPORT:
                return new SkiConditionsFactory();
            default:
                throw new IllegalArgumentException("cannot find ski report factory");
        }
    }
}
