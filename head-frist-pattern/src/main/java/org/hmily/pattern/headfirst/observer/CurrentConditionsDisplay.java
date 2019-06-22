package org.hmily.pattern.headfirst.observer;

/**
 * Created by zyzhmily on 2018/5/20.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherData=subject;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
         System.out.println("Current conditions: "+temperature+" F degree and "+humidity+" % humidity");
    }
}
