package com.liu.design_3_model.structure_01Adapter.case3_interfaceAdapter;

public class UserMainCls {
    public static void main(String[] args) {
        AbstractAdapter adapter = new AbstractAdapter() {
            // 只需要去覆盖我们需要使用的接口方法即可
            @Override
            public void method2() {
                System.out.println("采用临时内部类，实现了method2()方法！");
            }
        };
        adapter.method2();
    }
}
