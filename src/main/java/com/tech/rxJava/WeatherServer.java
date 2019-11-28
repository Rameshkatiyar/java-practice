package com.tech.rxJava;

import io.reactivex.Observable;

public class WeatherServer {

    public static Observable<WeatherInfo> getWeatherObservable(){
        Observable<WeatherInfo> weatherInfoObservable = Observable.create(new WeatherObservable());
        return weatherInfoObservable;
    }
}
