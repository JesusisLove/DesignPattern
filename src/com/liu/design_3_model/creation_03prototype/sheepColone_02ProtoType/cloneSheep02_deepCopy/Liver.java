package com.liu.design_3_model.creation_03prototype.sheepColone_02ProtoType.cloneSheep02_deepCopy;

import java.io.Serializable;

public class Liver implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;
    public Liver(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override // 因为该类的属性（cloneName和cloneClass）都是String类，所以，这里使用默认的clone方法即可
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
