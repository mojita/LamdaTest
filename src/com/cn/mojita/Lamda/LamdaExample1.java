package com.cn.mojita.Lamda;

import org.junit.Test;

/**
 * Created by lijunhong on 17/9/17.
 */
public class LamdaExample1 {

    //实现:字符串转化成小写
    @Test
    public void test1() {
        ILamdaExample1 lamda = (str) -> str.toLowerCase();
        System.out.println(lamda.getString("AfsASD"));
    }
}
