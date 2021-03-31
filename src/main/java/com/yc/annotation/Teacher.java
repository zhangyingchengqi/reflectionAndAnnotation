package com.yc.annotation;


@MyHelloWorld(name = "a", age = 30, ins = "打球")
public class Teacher {

    @MyHelloWorld(name = "b", ins = {"game", "swim"})
    private String name;


    public String show(String s) {

        return "";
    }
}
