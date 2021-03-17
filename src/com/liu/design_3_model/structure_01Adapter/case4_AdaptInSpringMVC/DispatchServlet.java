package com.liu.design_3_model.structure_01Adapter.case4_AdaptInSpringMVC;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    public static List<HandlerAdapter> handlerAdapterList = new ArrayList<HandlerAdapter>();
    public DispatchServlet() {
        handlerAdapterList.add(new AnnotationHandlerAdapter());
        handlerAdapterList.add(new HttpHandlerAdapter());
        handlerAdapterList.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        /*模拟SpringMVC从request去handler的对象*/
        // 适配器可以获取到希望的Controller

        AnnotationController controller = new AnnotationController();
//        HttpController controller = new HttpController();
//        SimpleController controller = new SimpleController();

        // 获得对应的适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter : this.handlerAdapterList) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
