package com.liu.design_3_model.behavior_05observer.subject_observer;


import com.liu.design_3_model.behavior_05observer.subject_observer.observer.CurrentConditions;
import com.liu.design_3_model.behavior_05observer.subject_observer.observer.IObserver;
import com.liu.design_3_model.behavior_05observer.subject_observer.observer.WangYiWeb;
import com.liu.design_3_model.behavior_05observer.subject_observer.observer.XinLang;
import com.liu.design_3_model.behavior_05observer.subject_observer.subject.WeatherData;

import java.util.ArrayList;

public class StartInterNetWebSite {
    public static void main(String[] args) {
        ArrayList<IObserver> observerArrayList = new ArrayList<>();
        // 把创建的接入方（第三方）纳入到数组里面
        observerArrayList.add(new CurrentConditions());
        observerArrayList.add(new XinLang());
        observerArrayList.add(new WangYiWeb());
        // 创建推送方，并将接入方聚合进来
        WeatherData weatherData = new WeatherData(observerArrayList);
        // 更新最新的数据，并推送给接入方
        weatherData.setDate(10.0f,200.0f,20.0f);
        // 每30分钟就推送一次
        weatherData.setDate(10.6f,190.0f,17.0f);
    }
}
