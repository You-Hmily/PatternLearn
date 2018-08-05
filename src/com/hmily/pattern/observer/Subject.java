package com.hmily.pattern.observer;

/**
 * Created by zyzhmily on 2018/5/20.
 * 主题
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
