package com.dream.freamwork.prototype.simple;

/**
 * @Data:2019/5/29 21:14
 * @author: Dream
 */

public class Client {

    /**创建客户端，接受原型对象*/

    public Prototype starClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
