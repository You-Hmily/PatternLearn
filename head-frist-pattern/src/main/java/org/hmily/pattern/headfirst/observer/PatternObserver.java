package com.hmily.pattern.observer;

/**
 * Created by zyzhmily on 2018/5/19.
 */
public class PatternObserver {

    public static void main(String[] args){
          WeatherData weatherData=new WeatherData();
          CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
          weatherData.setMeasurements(80,65,30.4f);
    }


}
