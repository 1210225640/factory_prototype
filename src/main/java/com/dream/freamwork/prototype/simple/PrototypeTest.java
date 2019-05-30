package com.dream.freamwork.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Data:2019/5/29 21:11
 * @author: Dream
 */

public class PrototypeTest {

    /**原型对象测试*/

    public static void main(String[] args) {
        /**创建原型对象*/
        ConcretePrototypeA  concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(18);
        concretePrototypeA.setName("Dream");
        List  list=new ArrayList();
        concretePrototypeA.setHobbies(list);


        /**调用客户端clone方法*/
        Client client=new Client();
        ConcretePrototypeA copy=(ConcretePrototypeA)client.starClone(concretePrototypeA);
        System.out.println(copy);

       /** ConcretePrototypeA copy=(ConcretePrototypeA)concretePrototypeA.clone();*/
        System.out.println("克隆对象引用类型地址的值："+copy.getHobbies());
        System.out.println("原对象引用类型地址的值:"+concretePrototypeA.getHobbies());
        System.out.println("对象地址比较"+(copy.getHobbies() ==concretePrototypeA.getHobbies()));


    }
}
