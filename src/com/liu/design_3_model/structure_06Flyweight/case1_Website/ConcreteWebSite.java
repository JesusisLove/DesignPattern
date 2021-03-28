package com.liu.design_3_model.structure_06Flyweight.case1_Website;

public class ConcreteWebSite extends AbsWebSite {
    private String websitetype = "";//网站发布的形式（新闻的形式，微博的形式，微信公众号的形式）

    public ConcreteWebSite(String type) {
        this.websitetype = type;
    }

    public void use(User user){
        System.out.println(user.getName() + " 的网站发布形式为：" + websitetype + " 正在使用中。。。");
    }
}
