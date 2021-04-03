package com.liu.design_3_model.behavior_03visitor.element;

import com.liu.design_3_model.behavior_03visitor.visitor.AbsScoreAction;

/* 说明：
* 1。这里使用了双分派，即首先在客户端程序中，将具体的状态作为参数传递到Femal，完成第一次分派
* 2。然后，在Female类里，调用作为参数的"具体方法"中的方法，即getScoreFromFeMale，同时将Female对象自己(this)作为参数传入，完成第二次分派
* 3。这种方式就是二次分派，这样做的好处是它达到了解耦，谁跟谁的解耦？Person和ScoreAction的解耦
* */

/* 被访问者具体类，也就是接受访问者具体类 */
public class Female extends AbsPerson {
    private String name;
    // 初始化女观众姓名
    public Female(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // 对外提供可以访问本对象的一个具体方法
    @Override
    /*
     * AbsScoreAction visitor：观众拿过测评器，给出了测评结果（visitor）【如好棒，很好，一般，尚可，不行，很差等等。。。】
     *           模拟场景：观众LiuYM，接过测评器，选择了"好棒"，那么这个visitor就是"好棒"类的实例
     *
     * visitor.getScoreFrom(this)：给出的这个测评结果，是谁给的（就是具体的观众），就把观众自己"登记"进去
     *           模拟场景：这个"好棒"实例对象，就把观众LiuYm传进去，表示，这个"好棒"的测评是LiuYm测评的。
     *
     * 通过这样一个模拟场景，来描述并体会，LiuYM（具体的Person类对象）和visitor（具体的Visitor类对象）之间的关联关系
     *
     * */
    public void accept(AbsScoreAction visitor) {
        visitor.getScoreFrom(this);
    }
}