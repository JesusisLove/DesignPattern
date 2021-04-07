package com.liu.design_3_model.behavior_05observer.commonsulation;

/*
* 显示当前的天气情况（可以理解成是气象站自己的网站）
* */
public class CurrentConditions {
    private float temperature; // 温度
    private float pressure;    // 气压
    private float humidity;    // 湿度

    // 别人（推送者：WeatherData）推送的最新的天气数据
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示推送过来的最新的天气数据信息
    public void display() {
        System.out.println("======= Today mTemperature: " + this.temperature);
        System.out.println("======= Today mpressure: " + this.pressure);
        System.out.println("======= Today mhumidity: " + this.humidity);
    }
}
