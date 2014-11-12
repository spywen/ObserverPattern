package com.observer.pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Weather");

        WeatherManager weatherManager = new WeatherManager();
        weatherManager.setTemp(32);
        TempDisplay tempDisplay = new TempDisplay(weatherManager);
        tempDisplay.display();
        weatherManager.update();

        weatherManager.setTemp(43);
        weatherManager.update();
    }
}
