package com.itqbq.oop;

public class TestObject extends Object{
//    String name;
//    String pwd;
//
//    public String toString(){
//        return "账号名："+name+"密码："+pwd;
//    }

    public static void main(String[] args) {
        TestObject t =new TestObject();
        System.out.println(t.toString());
        TestObject t2 = new TestObject();
        System.out.println(t2.toString());
        System.out.println(t2);
    }
}
