package com.cn.mojita.design;

/**
 * Created by lijunhong on 17/9/17.
 */
public class Mouse extends USBElectron {
    private String name;
    public Mouse(String name){
        this.name = name;
    }

    @Override
    public void function() {
        //这个是鼠标的方法
        System.out.println(this.name+":鼠标可以打字");
    }
}
