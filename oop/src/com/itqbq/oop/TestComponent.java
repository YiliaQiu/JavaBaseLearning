package com.itqbq.oop;

public class TestComponent {
}

class Person2 /*extends Object*/ {
    String name;
    int height;
    public void rest(){
        System.out.println("休息！");
    }
}

class Student2 extends Person2{
    Person2 person2 = new Person2();
    Boy b = new Boy();

    String major;
    public void study(){
        System.out.println("学习！");
        rest();
        System.out.println(this.person2.name);
    }

    public Student2(String name,int height,String major){
        this.person2.name = name;
        this.person2.height = height;
//        this.person2.major = major;
    }
}
