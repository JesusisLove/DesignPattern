package com.liu.design_3_model.behavior_10strategy.JDK_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Integer[] data1 = {9,4,2,7,1,8,6};
        // 实现升序排序，返回-1放左边，1放右边，0保持不变

        /* ⭐⭐⭐⭐说明⭐⭐⭐
        * 1）Comparator接口就是策略接口
        * 2）new Comparator<Integer>() {...}是实现Comparator策略接口的匿名类对象。
        * 3）匿名类里的int compare(Integer o1, Integer o2){...}是
        *      Comparator接口里对int compare(Integer o1, Integer o2)方法的具体实现.
        *  */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;
                else return -1;
            }
        };


        /*
        *  public static <T> void sort(T[] a, Comparator<? super T> c) {
        *       if (c == null) {
        *          sort(a); // ⭐⭐⭐--->如果没有策略对象传进来，就是用默认的排序方法
        *       } else {
        *          // ⭐⭐⭐️-️️-->使用传进来的策略对象
        *          if (LegacyMergeSort.userRequested)
        *              legacyMergeSort(a, c);
        *          else
        *              TimSort.sort(a, 0, a.length, c, null, 0, 0);
        *        }
        *  }
        * */
        // 方式一：通过comparator对象 实现策略模式
        Arrays.sort(data1,comparator);
        System.out.println("data1的升序排列：" + Arrays.toString(data1));// 升序排列后显示

        // 方式二：通过Lambda表达式 实现策略模式
        Integer[] data2 = {19,14,12,17,11,18,16};
        Arrays.parallelSort(data2,(var1,var2) -> {
          if (var1.compareTo(var2) > 0) return 1;
          else return -1;
        });
        System.out.println("data2的升序排列：" + Arrays.toString(data2));// 升序排列后显示
    }
}
