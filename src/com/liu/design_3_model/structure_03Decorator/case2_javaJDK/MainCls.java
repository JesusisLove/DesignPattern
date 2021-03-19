package com.liu.design_3_model.structure_03Decorator.case2_javaJDK;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class MainCls {
    public static void main(String[] args) {
        try {
            // 1.InputStream 是抽象类，类似星巴克案例中的Drink
            // 2.FileInputStream 是 InputStream的一个子类，FileInputStream相当于星巴克案例中的单品咖啡
            // 3.FilterInputStream 是 InputStream的一个子类，类似于星巴克案例中的Decorator 修饰者
            // 4.DataInputStream 是 FilterInputStream的子类，是具体的修饰着，类似于星巴克案例中的Milk，Soy等
            // 5.FilterInputStream类中，有 protected volatile InputStream in;即含有被装饰者

            DataInputStream inputStream = new DataInputStream(new FileInputStream("a.txt"));
            System.out.println(inputStream.read());
            inputStream.close();

        } catch (Exception e) {
            e.getMessage();
        }

    }
}
