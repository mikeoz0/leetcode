package abstractfactory;

class UtahSkiWeatherForcast implements SkiReport {
    @Override
    public String getReport() {
        return "Utah Ski Report - Cloudy and high of 22F, and low of 11F";
    }
}

class ColoradoSkiWeatherForcast implements SkiReport {

    @Override
    public String getReport() {
        return "Colorado Ski Report - Sunny and high of 32F, and low of 21F";
    }
}

class VermontSkiWeatherForcast implements SkiReport {

    @Override
    public String getReport() {
        return "Vermont Ski Report - Snowing and high of 29F, and low of 19F";
    }
}
