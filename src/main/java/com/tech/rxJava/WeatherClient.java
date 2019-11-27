package com.tech.rxJava;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class WeatherClient implements Observer<WeatherInfo> {

    private int clientId;
    private Disposable disposable;


    public WeatherClient(int clientId){
        this.clientId = clientId;
    }

    @Override
    public void onSubscribe(Disposable d) {
        System.out.println("Subscribed client : " + clientId);
        this.disposable = d;
    }

    @Override
    public void onNext(WeatherInfo weatherInfo) {
        String thread = Thread.currentThread().getName();
        System.out.println("Client "+ clientId +" : "+ weatherInfo.getCity() +" - "+ weatherInfo.getTemperature()+"   Thread: "+thread);
        if (weatherInfo.getTemperature() > 48.0f){
            disposable.dispose();
        }
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
