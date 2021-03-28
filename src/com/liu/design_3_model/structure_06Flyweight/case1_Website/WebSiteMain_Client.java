package com.liu.design_3_model.structure_06Flyweight.case1_Website;

public class WebSiteMain_Client {
    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();
        // 客户要一个以新闻形式发布的网站
        AbsWebSite webSite1 = factory.getWibSiteCategory("news");
        webSite1.use(new User("zhang san"));

        AbsWebSite webSite2 = factory.getWibSiteCategory("weChat");
        webSite2.use(new User("li si"));

        AbsWebSite webSite3 = factory.getWibSiteCategory("blog");
        webSite3.use(new User("wang wu"));

        AbsWebSite webSite4 = factory.getWibSiteCategory("news");
        webSite4.use(new User("zhao liu"));

        AbsWebSite webSite5 = factory.getWibSiteCategory("weChat");
        webSite5.use(new User("sun qi"));
        System.out.println("目前网站种类数：" + factory.getWebSiteCount());
    }
}
