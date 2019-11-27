package com.tech.rxJava;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.Arrays;
import java.util.List;

public class RxJavaMainClass {

    public static void main(String args[]) throws InterruptedException {
        List<String> listOfCity = Arrays.asList("BENG", "MYSR", "DELH", "MUMB", "PUNE", "HYDR");
        Observable<WeatherInfo> weatherInfo = WeatherServer.getWeatherInfo(listOfCity);

        WeatherClient weatherClient1 = new WeatherClient(1);
        WeatherClient weatherClient2 = new WeatherClient(2);

        weatherInfo
                .subscribeOn(Schedulers.computation())
                .subscribe(weatherClient1);

        weatherInfo.subscribe(weatherClient2);
        Thread.sleep(10000);

    }
}