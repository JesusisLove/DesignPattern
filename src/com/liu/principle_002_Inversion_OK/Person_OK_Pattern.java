package com.liu.principle_002_Inversion_OK;

import com.liu.principle_002_Inversion_NG.Community_Email;
import com.liu.principle_002_Inversion_NG.Community_LINE;

public class Person_OK_Pattern {
    /*
     * 新的解决思路：
     *   引入一个抽象的接口CommunityReveiver，表示接受者，这样Person类和接口发生依赖
     *  Email,WeChat,LINE,whatsApp都是通讯接收者，他们各自实现CommunityReveiver接口就好了
     *  这样的设计原则就是依赖倒转原则
     * */
    public void receive(CommunityReveiver reveiver) {
        System.out.println(reveiver.getInfo());
    }

    /*
    * 依赖倒转原则的好处：
    *    有很好的扩展性：再多添加n种通讯工具，Person信息接收的代码不需要再追加了
    * */

}


//// ⭐️⭐️⭐️⭐️方式一：通过接口传递实现依赖反转⭐️⭐️⭐️
//// 要被修理的电子仪器
//interface ITV { // ITV接口
//    public void play();
//    public void stop();
//}
//// 某电子修理厂各个车间的修理工
//interface IOpenAndClose { // 开关的接口
//    public void open(ITV tv);
//    public void close(ITV tv);
//}
//
//// 实现接口
//// 某修理师傅修理某个电子仪器
//class OpenAndClose implements IOpenAndClose {
//    public void open (ITV tv) {
//        tv.play();
//    }
//    public void close (ITV tv) {
//        tv.stop();
//    }
//}

//// ⭐️⭐️⭐️⭐️方式二：通过类的构造方法实现依赖反转传递⭐️⭐️⭐️
//interface ITV { // ITV接口
//    public void play();
//    public void stop();
//}
//// 某电子修理厂各个车间的修理工
//interface IOpenAndClose { // 开关的接口
//    public void open();
//    public void close();
//}
//
//// 实现接口
//// 某修理师傅修理某个电子仪器
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//    public OpenAndClose(ITV tv) { // 通过构造器传递依赖
//        this.tv = tv;
//    }
//    public void open () {
//        tv.play();
//    }
//    public void close () {
//        tv.stop();
//    }
//}

// ⭐️⭐️⭐️⭐️方式三：通过setter方法传递依赖反转⭐️⭐️⭐️
//interface ITV { // ITV接口
//    public void play();
//    public void stop();
//}
//// 某电子修理厂各个车间的修理工
//interface IOpenAndClose { // 开关的接口
//    public void setTv(ITV tv); // 通过setter传递依赖
//    public void open();
//    public void close();
//}

//// 实现接口
//// 某修理师傅修理某个电子仪器
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;
//    public void setTv(ITV tv) { // 通过setter传递依赖
//        this.tv = tv;
//    }
//    public void open () {
//        tv.play();
//    }
//    public void close () {
//        tv.stop();
//    }
//}
//class SonyTV implements ITV {
//    @Override
//    public void play() {
//        System.out.println("Sony TV is turned on...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Sony TV is turned off...");
//
//    }
//}