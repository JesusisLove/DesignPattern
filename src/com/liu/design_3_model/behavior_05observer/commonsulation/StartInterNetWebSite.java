package com.liu.design_3_model.behavior_05observer.commonsulation;

public class StartInterNetWebSite {
    public static void main(String[] args) {
        // 创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建推送方，并将接入方聚合进来
        WeatherData weatherData = new WeatherData(currentConditions);
        // 更新最新的数据，并推送给接入方
        weatherData.setDate(10.0f,200.0f,20.0f);
        // 每30分钟就推送一次
        weatherData.setDate(10.6f,190.0f,17.0f);
    }
}
