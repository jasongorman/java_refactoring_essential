package com.codemanship.refactoring.duplication;

class Forecast {

    private final String period; // "morning", "afternoon", "evening", "night"
    private enum period {
        MORNING, AFTERNOON, EVENING, NIGHT
    }
    private final double temperature;
    private final String condition;
    private final int windSpeed;

    public Forecast(String period, double temperature, String condition, int windSpeed) {
        this.period = period;
        this.temperature = temperature;
        this.condition = condition;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public boolean isMorning() {
        return "morning".equals(period);
    }

    public boolean isAfternoon() {
        return "afternoon".equals(period);
    }

    public boolean isEvening() {
        return "evening".equals(period);
    }

    public boolean isNight() {
        return "night".equals(period);
    }
}
