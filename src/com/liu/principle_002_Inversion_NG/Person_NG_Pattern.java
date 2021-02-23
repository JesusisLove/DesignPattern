package com.liu.principle_002_Inversion_NG;

public class Person_NG_Pattern {
    // 实现了用户接收消息的功能
    public void receive(Community_Email communityEmail) {
        System.out.println(communityEmail.getInfo());
    }
    /* 实现消息接收功能发现：传递参数直接写死了：传递Email类对象
    * 如果我们获取的对象是微信，Line，whatsApp，短信等类型的消息，势必要再额外增加微信类，Line类，whatApp类等等，
    * 同时，再Person类里再加接收这些不同信息类的方法，如reveive(WeChat chat)，reveive(WhatsApp chat)等等
    */

    public void receive(Community_LINE community) {
        System.out.println(community.getInfo());
    }

    public void receive(Community_WeChat community) {
        System.out.println(community.getInfo());
    }

    public void receive(Community_whatsApp community) {
        System.out.println(community.getInfo());
    }



    /*
    * 新的解决思路：
    *   引入一个抽象的接口CommunityReveiver，表示接受者，这样Person类和接口发生依赖
    *  Email,WeChat,LINE,whatsApp都是通讯接收者，他们各自实现CommunityReveiver接口就好了
    *  这样的设计原则就是依赖倒转原则
    * */


}
