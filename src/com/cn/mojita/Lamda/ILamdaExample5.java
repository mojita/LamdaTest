package com.cn.mojita.Lamda;

@FunctionalInterface
public interface ILamdaExample5 {

    String getString(String str);

    //实现方法
    default String getUpperCase(String str) {
        return str.toUpperCase();
    }

    static String getLowerCase(String str) {
        return str.toLowerCase();
    }

}
