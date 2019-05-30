package com.dream.freamwork.prototype.work;

/**
 * @Data:2019/5/29 23:02
 * @author: Dream
 */

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
