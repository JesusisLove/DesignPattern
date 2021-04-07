package com.liu.design_3_model.behavior_05observer.subject_observer.observer;
// 观察者接口，由观察者类来实现
public interface IObserver {
    void update(float temperature, float pressure, float humidity);
    void display();
}
