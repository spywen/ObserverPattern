package com.observer.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by laurent on 11/11/14.
 */
public class TempDisplay implements Observer {
    Observable observable;
    private float temp;

    public TempDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Observable){
            WeatherManager weatherManager = (WeatherManager)o;
            this.temp = weatherManager.getTemp();
            display();
        }
    }

    public void display(){
        System.out.println("Current temp : " + this.temp);
    }

}
