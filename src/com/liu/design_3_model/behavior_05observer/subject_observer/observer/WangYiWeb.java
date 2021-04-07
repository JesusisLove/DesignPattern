package com.liu.design_3_model.behavior_05observer.subject_observer.observer;

public class WangYiWeb implements IObserver{
    private float temperature; // 温度
    private float pressure;    // 气压
    private float humidity;    // 湿度

    // 别人（推送者：WeatherData）推送的最新的天气数据
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示推送过来的最新的天气数据信息
    @Override
    public void display() {
        System.out.println("======= Today mTemperature 网易: " + this.temperature);
        System.out.println("======= Today mpressure 网易: " + this.pressure);
        System.out.println("======= Today mhumidity 网易: " + this.humidity);
    }
}
