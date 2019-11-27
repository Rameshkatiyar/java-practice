package com.tech.rxJava;

public class WeatherInfo {
    String city;
    float temperature;
    float windSpeed;

    public WeatherInfo(String city, float temperature, float windSpeed){
        this.city = city;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }
}
