package com.cn.mojita.Lamda;

@FunctionalInterface
public interface ILamdaExample4 {

    String getString(String str);

    default String getStringUpperCase(String str) {
        System.out.println("接口中的实现upper");
        return str.toUpperCase();
    }

    default String getStringLowerCase(String str) {
        System.out.println("接口中的实现lower");
        return str.toLowerCase();
    }

}
