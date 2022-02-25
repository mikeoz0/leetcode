package abstractfactory;

class UtahSkiReport implements SkiReport {
    @Override
    public String getReport() {
        return "Utah Ski Report - 2 inches of snow in last 24 hours";
    }
}

class ColoradoSkiReport implements SkiReport {

    @Override
    public String getReport() {
        return "Colorado Ski Report - 8 inches of snow in last 24 hours";
    }
}

class VermontSkiReport implements SkiReport {

    @Override
    public String getReport() {
        return "Vermont Ski Report - 12 inches of snow in last 24 hours";
    }
}
