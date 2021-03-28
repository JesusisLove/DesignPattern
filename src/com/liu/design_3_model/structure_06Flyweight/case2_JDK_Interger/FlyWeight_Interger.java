package com.liu.design_3_model.structure_06Flyweight.case2_JDK_Interger;

public class FlyWeight_Interger {
    public static void main(String[] args) {

        // 如果Integer.valueOf(m)，m在-128～127之间，就是使用享元模式返回;
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        System.out.println(x.equals(y)); // ?
         System.out.println(x == y); // ?
        System.out.println(x == z); // ?
        System.out.println(w == x); // ?
        System.out.println(w == y); // ?

        // m=200的情况下，因为不在-128～127之间，所以Integer.valueOf(200)总是返回新的Integer实例对象，所以 （x1 == y2）为false
        // 另外，当m在-128～127之间是，使用享元模式返回，享元方式要比new Integer()执行速度快。
        Integer x1 = Integer.valueOf(200);
        Integer y1 = Integer.valueOf(200);
        System.out.println(x1 == y1); // ?

    }


}
// Integer.valueOf(127);
//JAVA JDK 中Ingeger的源代码
// public final class Integer extends Number implements Comparable<java.lang.Integer> {
//    public static Integer valueOf(int i) {
//        if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
//            return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
//        return new Integer(i);
//    }