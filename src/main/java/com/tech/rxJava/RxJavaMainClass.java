package com.tech.rxJava;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class RxJavaMainClass {

    public static void main(String args[]) throws InterruptedException {
        Observable<WeatherInfo> weatherObservable = WeatherServer.getWeatherObservable();

        WeatherObserver weatherObserver = new WeatherObserver();

        weatherObservable
                .filter(weatherInfo1 -> weatherInfo1.getTemperature() > 40)
                .subscribeOn(Schedulers.computation())
                .onErrorReturnItem(new WeatherInfo("NA", 0, 0))
                .subscribe(weatherObserver);

        Thread.sleep(50000);

    }
}