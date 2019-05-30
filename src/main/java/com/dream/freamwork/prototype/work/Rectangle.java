package com.dream.freamwork.prototype.work;

/**
 * @Data:2019/5/29 23:01
 * @author: Dream
 */

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
