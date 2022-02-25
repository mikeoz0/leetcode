package abstractfactory;

public class SkiWeatherForcastFactory extends AbstractSkiReportFactory{

    public SkiReport getNearestSkiReport(double lat, double lon) {
        String state = getNearestState(lat, lon);

        if (state.equalsIgnoreCase("colorado")) {
            return new ColoradoSkiWeatherForcast();
        } else if (state.equalsIgnoreCase("utah")){
            return new UtahSkiWeatherForcast();
        } else if (state.equalsIgnoreCase("vermont")){
            return new VermontSkiWeatherForcast();
        }

        throw new IllegalArgumentException("cannot find nearest ski report");

    }

    private static String getNearestState(double lat, double lon) {
        //todo: some complex look up here... with lat and lon...
        return "COLORADO"; //hard coding for now
    }

}