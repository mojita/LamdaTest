package com.cn.mojita.Lamda;

import org.junit.Test;

public class LamdaExample4 {

    @Test
    public void test1() {
        //支持Lamda表达式的
        ILamdaExample4 lamda = (str) -> str.toString();
        System.out.println(lamda.getStringLowerCase("asdfasdf"));

        //曾经没有支持Lamda表达式的
        LamdaExampleImpl4 lamdaExampleImpl4 = new LamdaExampleImpl4();
        System.out.println(lamdaExampleImpl4.getStringUpperCase("asdfsadf"));

    }
}
