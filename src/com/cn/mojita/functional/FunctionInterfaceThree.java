package com.cn.mojita.functional;


public interface FunctionInterfaceThree {

    String getString();

    default String getUpperCase(String str) {
        return str.toLowerCase();
    }

    static String getLoweCase(String str) {
        return str.toLowerCase();
    }
}
