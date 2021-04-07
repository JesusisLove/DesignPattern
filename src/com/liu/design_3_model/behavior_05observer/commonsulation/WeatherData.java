package com.liu.design_3_model.behavior_05observer.commonsulation;

/*
 * 这是天气预报信息的核心类
 * 1。包含最新的天气情况信息
 * 2。含有CurrentConditions对象
 * 3。当数据有更新时，就主动调用CurrentConditions对象的update方法，进行消息推送
 * 4。推送之后，CurrentCondition气象网站就能看到最新的气象信息了
 * */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    // 实时更新最新的天气数据信息
    public void setDate(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();// 新数据推送
    }

    // 当数据有更新是，就执行新数据的推送动作
    private void dataChange() {
        currentConditions.update(this.temperature,this.pressure,this.humidity);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
