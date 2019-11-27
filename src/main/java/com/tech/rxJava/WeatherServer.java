package com.tech.rxJava;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

import java.util.List;

public class WeatherServer {

    public static Observable<WeatherInfo> getWeatherInfo(List<String> listOfCity){
        Observable<WeatherInfo> weatherInfoObservable = Observable.create(new WeatherObservable(listOfCity));
        return weatherInfoObservable;
    }

//    private static ObservableOnSubscribe<WeatherInfo> processRequest(List<String> listOfCity) {
//        return emitter -> {
//            System.out.println("Getting weather info...");
//            while (!emitter.isDisposed()) {
//                listOfCity.stream()
//                        .map(WeatherServer::fetchWeatherInfo)
//                        .forEach(
//                                weatherInfo -> {
//                                    emitter.onNext(weatherInfo);
//                                    sleep(1);
//                                }
//                        );
//            }
//        };
//    }
//
//
//    private static WeatherInfo fetchWeatherInfo(String city){
//        float temperature = WeatherAPI.getTemperature(city);
//        float windSpeed = WeatherAPI.getWindSpeed(city);
//        return new WeatherInfo(city, temperature, windSpeed);
//    }
//
//    private static void sleep(int sec){
//        try {
//            Thread.sleep(sec*1000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
