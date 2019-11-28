package com.tech.rxJava;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class WeatherAPI {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static WeatherInfo fetchWeatherInfo(String city){
        float temperature = getTemperature(city);
        float windSpeed = getWindSpeed(city);
        return new WeatherInfo(city, temperature, windSpeed);
    }

    public static float getTemperature(String city){
        //Here call some weather api and get the given city's temperature.
        //Here we are generating random temperature from 20 to 50 degree Cel for given city.
        return getRandomNumber(20, 50);
    }

    public static float getWindSpeed(String city){
        //Here call some weather api and get the given city's wind speed.
        return getRandomNumber(1, 10);
    }

    private static float getRandomNumber(int min, int max){
        float randomNum = (float) (Math.random() * ((max - min) + 1)) + min;
        df.setRoundingMode(RoundingMode.UP);
        return Float.parseFloat(df.format(randomNum));
    }
}
