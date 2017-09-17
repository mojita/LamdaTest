package com.cn.mojita.Lamda;

import org.junit.Test;

/**
 * Created by lijunhong on 17/9/17.
 */
public class LamdaExample2 {

    //实现加减乘除
    @Test
    public void test1() {
        ILamdaExample2 lamda1 = (x,y) -> x + y;
        System.out.println(lamda1.compute(1,2));

        ILamdaExample2 lamda2 = (x,y) -> x - y;
        System.out.println(lamda2.compute(1,2));

        ILamdaExample2 lamda3 = (x,y) -> x * y;
        System.out.println(lamda3.compute(1,2));

        ILamdaExample2 lamda4 = (x,y) -> x / y;
        System.out.println(lamda4.compute(1,2));

    }
}
