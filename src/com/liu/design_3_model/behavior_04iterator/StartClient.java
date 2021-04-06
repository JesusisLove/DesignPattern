package com.liu.design_3_model.behavior_04iterator;

import com.liu.design_3_model.behavior_04iterator.aggregate.ComputerCollege;
import com.liu.design_3_model.behavior_04iterator.aggregate.IUniversity;
import com.liu.design_3_model.behavior_04iterator.aggregate.InformationCollege;

import java.util.*;

public class StartClient {
    public static void main(String[] args) {
        List<IUniversity> list = new ArrayList<>();
        IUniversity comptCollege = new ComputerCollege();
        IUniversity infoCollege = new InformationCollege();
        list.add(comptCollege);
        list.add(infoCollege);

        OutputPrint outputPrint = new OutputPrint(list);
        outputPrint.startPrint();
    }
}
