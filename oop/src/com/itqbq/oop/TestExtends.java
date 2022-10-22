package com.itqbq.oop;
/*
测试继承
 */

public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("QBQ",155,"java");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
    }
}

class Person /*extends Object*/ {
    String name;
    int height;
    public void rest(){
        System.out.println("休息！");
    }
}

class Student extends Person{
    String major;
    public void study(){
        System.out.println("学习！");
        rest();
        System.out.println(this.name);
    }

    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
}

class Boy extends Person{
//    在这里也可以扩展Preson外新的属性和方法
}
