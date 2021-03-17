package com.liu.design_3_model.structure_01Adapter.case4_AdaptInSpringMVC;

public interface Controller {
}

class AnnotationController implements Controller {
    public void doAnnotationController() {
        System.out.println("annotation...");
    }
}

class HttpController implements Controller {
    public void doHttpController() {
        System.out.println("http...");
    }
}

class SimpleController implements Controller {
    public void doSimpleController() {
        System.out.println("simple...");
    }
}