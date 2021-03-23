package com.liu.design_3_model.structure_04Composite;

public class StartMainCls {
    public static void main(String[] args) {
        // 从大到小创建对象
        // 创建综合大学
        AbsOrganization university = new Component1_University("东京大学","日本顶级高等大学");

        // 创建东京大学下属的各个学院
        AbsOrganization collegeComputer = new Component2_College("计算机学院","1965年创立");
        AbsOrganization collegeInfoEngeneer = new Component2_College("信息工程学院","1965年创立");

        // 建立计算机学院下属的各个系
        collegeComputer.add(new Leaf_Department("软件工程系","创建于1970年"));
        collegeComputer.add(new Leaf_Department("网络工程系","创建于1973年"));
        collegeComputer.add(new Leaf_Department("计算机科学与技术系","创建于1978年"));

        // 建立信息工程学院下属的各个系及专业
        collegeInfoEngeneer.add(new Leaf_Department("通讯工程系","创建于1972年"));
        collegeInfoEngeneer.add(new Leaf_Department("信息管理系","创建于1975年"));

        // 将学院加入到综合大学中
        university.add(collegeComputer);
        university.add(collegeInfoEngeneer);
        // 查看整个大学
        university.print();
        //查看单个学院
//        collegeComputer.print();
//        collegeComputer.print();
    }
}
