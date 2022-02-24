package factorymethod;

public class SkiReportFactory {

    public static SkiConditions getNearestSkiReport(double lat, double lon) {
        String state = getNearestState(lat, lon);

        if (state.equalsIgnoreCase("colorado")) {
            return new ColoradoSkiReport();
        } else if (state.equalsIgnoreCase("utah")){
            return new UtahSkiReport();
        } else if (state.equalsIgnoreCase("vermont")){
            return new VermontSkiReport();
        }

        throw new IllegalArgumentException("cannot find nearest ski report");

    }

    private static String getNearestState(double lat, double lon) {
        //todo: some complex look up here... with lat and lon...
        return "COLORADO"; //hard coding for now
    }

}