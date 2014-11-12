package com.observer.pattern;

import java.util.Observable;

/**
 * Created by laurent on 11/11/14.
 */
public class WeatherManager extends Observable {
    private float temp;

    public WeatherManager(){}

    public void update(){
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
}
