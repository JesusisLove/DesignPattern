package com.liu.design_3_model.behavior_05observer.subject_observer.subject;

import com.liu.design_3_model.behavior_05observer.subject_observer.observer.IObserver;

// 接口，让WeatherData来实现该接口
public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
}
