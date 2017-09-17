package com.cn.mojita.design;

/**
 * Created by lijunhong on 17/9/17.
 */
public class Computer extends USBElectron {

    private String name;

    public Computer(String name){
        this.name = name;
    }

    public void function() {
        //这个方法是电脑的方法
        System.out.println(this.name+":电脑可以上网，聊天，学习");
    }
}
