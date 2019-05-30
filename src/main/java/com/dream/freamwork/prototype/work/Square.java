package com.dream.freamwork.prototype.work;

/**
 * @Data:2019/5/29 23:02
 * @author: Dream
 */

public class Square extends  Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
