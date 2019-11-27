package com.tech.rxJava;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

import java.util.List;

public class WeatherObservable implements ObservableOnSubscribe<WeatherInfo> {

    private List<String> listOfCity;

    public WeatherObservable(List<String> listOfCity){
        this.listOfCity = listOfCity;
    }

    @Override
    public void subscribe(ObservableEmitter<WeatherInfo> emitter) throws Exception {
        while (!emitter.isDisposed()) {
            listOfCity.stream()
                    .map(WeatherObservable::fetchWeatherInfo)
                    .forEach(
                            weatherInfo -> {
                                emitter.onNext(weatherInfo);
                                sleep(1);
                            }
                    );
        }
    }

    private static WeatherInfo fetchWeatherInfo(String city){
        float temperature = WeatherAPI.getTemperature(city);
        float windSpeed = WeatherAPI.getWindSpeed(city);
        return new WeatherInfo(city, temperature, windSpeed);
    }

    private static void sleep(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
