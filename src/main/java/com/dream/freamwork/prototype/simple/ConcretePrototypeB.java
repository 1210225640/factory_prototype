package com.dream.freamwork.prototype.simple;

import java.util.List;

/**
 * @Data:2019/5/29 21:02
 * @author: Dream
 */

public class ConcretePrototypeB implements Prototype {

    /**年龄*/
    private  int age;
    /**姓名*/
    private  String name;
    /**爱好*/
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        /**创建copy对象*/
        ConcretePrototypeB concretePrototypeA=new ConcretePrototypeB();
        concretePrototypeA.setAge(this.age);
        concretePrototypeA.setName(this.name);
        concretePrototypeA.setHobbies(this.hobbies);
        return concretePrototypeA;
    }
}
