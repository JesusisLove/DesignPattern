package com.liu.design_3_model.creation_03prototype.sheepColone_02ProtoType.cloneSheep01_shallowCopy;

public class StartMainCls {
    public static void main(String[] args) {
        System.out.println("------- 用原型模式解决克隆羊问题 -------");
        Sheep sheep = new Sheep("Tom", 1, "while");
        //  添加一个类的成员变量，看看克隆是，类的成员变量的哈希值会不会改变 start
        Sheep firend = new Sheep("Taddy", 1, "grey");
        sheep.setFriend(firend);
        //  添加一个类的成员变量，看看克隆是，类的成员变量的哈希值会不会改变 end

        // 开始克隆
        Sheep sheep0 = (Sheep) sheep.clone();
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        // 执行代码测试一下克隆出来的sheep0，sheep1...的类成员变量friend是不是同一个对象
        System.out.println("sheep0" + sheep0 + "  //sheep0.friend.hashCode = " + sheep0.getFriend().hashCode() + "  //sheep0.name.hashCode = " + sheep0.getName().hashCode());
        System.out.println("sheep1" + sheep1 + "  //sheep1.friend.hashCode = " + sheep1.getFriend().hashCode() + "  //sheep1.name.hashCode = " + sheep1.getName().hashCode());
        System.out.println("sheep2" + sheep2 + "  //sheep2.friend.hashCode = " + sheep2.getFriend().hashCode() + "  //sheep2.name.hashCode = " + sheep2.getName().hashCode());
        System.out.println("sheep3" + sheep3 + "  //sheep3.friend.hashCode = " + sheep3.getFriend().hashCode() + "  //sheep3.name.hashCode = " + sheep3.getName().hashCode());
        System.out.println("sheep4" + sheep4 + "  //sheep4.friend.hashCode = " + sheep4.getFriend().hashCode() + "  //sheep4.name.hashCode = " + sheep4.getName().hashCode());

        /* 根据执行结果发现：sheep0，sheep1...这些克隆对象的friend对象却全部都是指向一个对象，也就是说克隆出来的羊虽然都是不同的sheep对象，
        * 但是，克隆羊里的frind对象仍然还是一个对象：这样的拷贝就是浅拷贝：
        * sheep0Sheep{name='Tom', age=1, color='while'}// sheep0.friend.hashCode = 1554874502
        * sheep1Sheep{name='Tom', age=1, color='while'}// sheep1.friend.hashCode = 1554874502
        * sheep2Sheep{name='Tom', age=1, color='while'}// sheep2.friend.hashCode = 1554874502
        * sheep3Sheep{name='Tom', age=1, color='while'}// sheep3.friend.hashCode = 1554874502
        * sheep4Sheep{name='Tom', age=1, color='while'}// sheep4.friend.hashCode = 1554874502

        * 浅拷贝的形象描述就是：克隆羊虽然是10只不同的羊，但是这10只克隆羊却共用一个心肝肾肠胃，就像连体婴儿，这是不正常的现象。（心肝肾肠胃是Sheep类的内部成员变量）
        * 同样道理，在实际开发中，我们也希望在执行克隆对象的时候，它里面的类成员变量也是希望是克隆对象里面自己的类对象成员变量，不要都指向同一个类成员变量
        * 这就会涉及到另外一个概念：深拷贝
        * 深拷贝就是，克隆出来的羊，各自都有属于各自的身体器官而不是连体器官
        */

    }
}