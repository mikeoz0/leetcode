package factorymethod;

public interface SkiConditions {
    String getSnowReport();
}

class UtahSkiReport implements SkiConditions {
    @Override
    public String getSnowReport() {
        return "Utah Ski Report - 2 inches of snow in last 24 hours";
    }
}

class ColoradoSkiReport implements SkiConditions {

    @Override
    public String getSnowReport() {
        return "Colorado Ski Report - 8 inches of snow in last 24 hours";
    }
}

class VermontSkiReport implements SkiConditions {

    @Override
    public String getSnowReport() {
        return "Vermont Ski Report - 12 inches of snow in last 24 hours";
    }
}
