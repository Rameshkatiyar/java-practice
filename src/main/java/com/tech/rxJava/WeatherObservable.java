package com.tech.rxJava;

import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

import java.util.Arrays;
import java.util.List;

public class WeatherObservable implements ObservableOnSubscribe<WeatherInfo> {

    private List<String> listOfCity = Arrays.asList("BENG", "MYSR", "DELH", "MUMB", "PUNE", "HYDR");

    @Override
    public void subscribe(ObservableEmitter<WeatherInfo> emitter) {
        int hoursCount = 0;
        while (hoursCount++ < 2) {
            listOfCity.stream()
                    .map(WeatherAPI::fetchWeatherInfo)
                    .forEach(
                            weatherInfo -> {
                                emitter.onNext(weatherInfo);
                                sleep(1);
                            }
                    );
        }
        emitter.onComplete();
    }

    private static void sleep(int sec){
        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
