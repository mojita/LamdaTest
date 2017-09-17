package com.cn.mojita.design;

import org.junit.Test;

/**
 * Created by lijunhong on 17/9/17.
 */
public class Test1 {

    @Test
    public void test1() {
        //简单工厂创建实例演示
        //创建工厂
        ElectronFactory factory = new ElectronFactory();
        //创建电脑实例
        USBElectron computer = factory.creatDevice("computer");
        computer.function();
        //创建鼠标实例
        USBElectron mouse = factory.creatDevice("mouse");
        mouse.function();
    }
}
