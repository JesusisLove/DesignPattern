package com.liu.design_3_model.structure_01Adapter.case4_AdaptInSpringMVC;

import java.util.ArrayList;
import java.util.List;

public interface HandlerAdapter {
    public boolean supports(Object handler);
    public void handle(Object handler);
}

class AnnotationHandlerAdapter implements HandlerAdapter {
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationController();
    }

    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }
}

class HttpHandlerAdapter implements HandlerAdapter {
    public void handle(Object handler) {
        ((HttpController)handler).doHttpController();
    }

    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }
}

class SimpleHandlerAdapter implements HandlerAdapter {
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleController();
    }

    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }
}