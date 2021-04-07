package com.liu.design_3_model.behavior_05observer.subject_observer.subject;

import com.liu.design_3_model.behavior_05observer.commonsulation.CurrentConditions;
import com.liu.design_3_model.behavior_05observer.subject_observer.observer.IObserver;

import java.util.ArrayList;

/*
 * 这是天气预报信息的核心类
 * 1。包含最新的天气情况信息
 * 2。含有观察者的对象集合，使用ArrayList来管理
 * 3。当数据有更新时，就主动调用ArrayList里的对象的update方法，进行消息推送
 * 4。推送之后，所有ArrayList集合里的对象就能看到最新的气象信息了
 * */
public class WeatherData implements ISubject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<IObserver> observerArrayList;

    public WeatherData(ArrayList<IObserver> observerArrayList) {
        this.observerArrayList = observerArrayList;
    }

    // 实时更新最新的天气数据信息
    public void setDate(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange() {
        notifyObservers();
    }

    // 当数据有更新是，就执行新数据的推送动作
    @Override
    public void notifyObservers() {
        for (IObserver obs:observerArrayList) {
            obs.update(this.temperature, this.pressure, this.humidity);
        }
    }
    // 注册用户：即往数据集合里追加元素（这个元素就是要推送数据给第三方网站，如将天气预报数据推送给新浪，网易，百度等等）
    @Override
    public void registerObserver(IObserver observer) {
        observerArrayList.add(observer);
    }

    // 注消用户：即从数据集合里删除元素（这个元素就是要推送数据给第三方网站，如将天气预报数据推送给新浪，网易，百度等等）
    @Override
    public void removeObserver(IObserver observer) {
        if(observerArrayList.contains(observer)) {
            observerArrayList.remove(observer);
        }
    }
}
