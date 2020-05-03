package com.tech.rxJava;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class WeatherObserver implements Observer<WeatherInfo> {

    private Disposable disposable;

    @Override
    public void onSubscribe(Disposable d) {
        System.out.println("Subscribed weather observer!");
        this.disposable = d;
    }

    @Override
    public void onNext(WeatherInfo weatherInfo) {
        String thread = Thread.currentThread().getName();
//        System.out.println(weatherInfo.getCity() +" - "+ weatherInfo.getTemperature()+"  |  Thread: "+thread);
//        System.out.println(weatherInfo.getCity() +" - "+ weatherInfo.getTemperature());
        System.out.println("Receiving - "+weatherInfo.getCity() +" - "+ weatherInfo.getTemperature()+"  |  Thread: "+thread);

        //Unsubscribe, once we got Bangalore temp above then 49.
//        if (weatherInfo.getCity().equalsIgnoreCase("BENG") && weatherInfo.getTemperature() > 46){
//            disposable.dispose();
//            System.out.println("Unsubscribed with weather observable!");
//        }
    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Got an error: " + e.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Data flow is DONE!");
    }
}
