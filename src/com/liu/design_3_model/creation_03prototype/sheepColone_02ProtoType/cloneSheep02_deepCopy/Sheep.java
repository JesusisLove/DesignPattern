package com.liu.design_3_model.creation_03prototype.sheepColone_02ProtoType.cloneSheep02_deepCopy;

import java.io.*;

public class Sheep implements Serializable,Cloneable {
    public String name;// String类型的属性
    public Sheep() {
        super();
    }
    private Heart heart = new Heart("羊的心脏","器官类");// 引用类型的属性
    private Liver liver = new Liver("羊的肝脏","器官类");

    public Heart getHeart() {
        return heart;
    }
    public Liver getLiver() {
        return liver;
    }


    // 实现深拷贝：方法一 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deepCopy = null;
        // 这里是完成对基本数据类型的克隆
        deepCopy = super.clone();

        // 对引用类型的属性Heart，进行单独处理
        Sheep sheep = (Sheep) deepCopy;
        sheep.heart = (Heart) heart.clone();//因为Heart器官类也是继承Cloneable接口，所以，对被克隆羊的heart进行克隆
        sheep.liver = (Liver) liver.clone();

        return sheep;
    }

    // 实现深拷贝：方法二 通过对象的序列化实现（推荐使用）
    public Object deepCloneWithSerializable() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream    oos = null;
        ByteArrayInputStream  bis = null;
        ObjectInputStream     ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 将当前这个对象整体（包含对象里面的类成员变量）以对象流的方式输出（这就是我们所说的序列化）

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep serializedSheepObject = (Sheep) ois.readObject();

            return serializedSheepObject;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
