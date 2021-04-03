package com.liu.design_3_model.behavior_03visitor;

import com.liu.design_3_model.behavior_03visitor.element.Female;
import com.liu.design_3_model.behavior_03visitor.element.Male;
import com.liu.design_3_model.behavior_03visitor.objectStructure.ObjectStructure;
import com.liu.design_3_model.behavior_03visitor.visitor.ScoreBad;
import com.liu.design_3_model.behavior_03visitor.visitor.ScoreGood;
import com.liu.design_3_model.behavior_03visitor.visitor.ScoreNotBad;

public class StartClient {
    public static void main(String[] args) {
        // 创建ObjectStructrue
        ObjectStructure objectStructure = new ObjectStructure();

        // 参加的观众（按男女分组）
        objectStructure.attach(new Male("titeng"));
        objectStructure.attach(new Female("lili"));
        objectStructure.attach(new Female("meimei"));
        System.out.println("===================================");
        // 给好评
        ScoreGood good = new ScoreGood();
        objectStructure.display(good);
        System.out.println("===================================");
        // 给差评
        ScoreBad bad = new ScoreBad();
        objectStructure.display(bad);
        System.out.println("===================================");
        // 给还不错的评价
        ScoreNotBad notbad = new ScoreNotBad();
        objectStructure.display(notbad);

    }
}
