package com.liu.design_3_model.behavior_09state.moneyLending;
/*
* Hoge类与借贷平台业务无关
* 该代码留着，作为学习枚举的参考例子
* */
public class Hoge {
    public static enum Type {
        HOGE("Hoge", "HH") {
            @Override // 抽象メソッドの実装
            public void doSomething() {}
        },
        FUGA("Fuga", "FF") {
            @Override // 抽象メソッドの実装
            public void doSomething() {}
        };

        private final String label;
        private final String value;

        // コンストラクタ
        private Type(String label, String value) {
            this.label = label;
            this.value = value;
        }

        // labelの取得
        public String getLabel() {
            return this.label;
        }

        // valueの取得
        public String getValue() {
            return this.value;
        }

        public static Type ValueOf(final String value) {
            Type[] types = Type.values();
            for (Type type : types) {
                if (type.getValue() == value) {
                    return type;
                }
            }
            return null;
        }

        // 抽象メソッドの定義
        public abstract void doSomething();
    }
}
