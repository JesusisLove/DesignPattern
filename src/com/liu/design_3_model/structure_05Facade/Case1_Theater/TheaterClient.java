package com.liu.design_3_model.structure_05Facade.case1_Theater;

public class TheaterClient {

    public static void main(String[] args) {
        TheaterFacadeHome facade = new TheaterFacadeHome();
        /*
        * 客户端开始依赖外观类，让外观类去协调子系统中子类各自担当的角色，
        * 而客户根本就不需要关心子系统之间的运作是如何协调的
        **/

        facade.ready();
        facade.play();
        facade.pause();
        facade.end();

        /*这种应用场景也可以用在，医院🏥（病人看病），政府机关（公民去政府办事）
        *
        * 医院：病人看病
        *    病人就好比客户端，医院就相当于一个Facade，
        *    病人看病，不关心药品怎么配方，检查设备怎么协调运行。
        *    病人只需要对医院发出一个看病的依赖
        *    然后医院这个Facade返回给病人一个诊断结果
        *
        * 政府机关：公民去申请护照
        *    公民就好比是一个客户端，政府机构就相当于一个Facade
        *    公民提出护照申请，并不关心护照怎么去完成，那是政府机关各个子部门之间协调运作的事情
        *    公民只需要向政府提交申请依赖
        *    然后政府这个Facade返回一本护照给公民
        *
        * */

    }

}
