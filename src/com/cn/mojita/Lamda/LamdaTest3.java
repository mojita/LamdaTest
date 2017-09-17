package com.cn.mojita.Lamda;

import java.io.PrintStream;
import java.util.Collections;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * Created by lijunhong on 17/9/17.
 */
public class LamdaTest3 {
    //方法引用
    @Test
    public void test1() {
        //没有使用方法引用
        Consumer<String> consumer = (str) -> System.out.println(str);
        //使用方法引用
        PrintStream p = System.out;
        Consumer<String> com = p::println;

        Consumer<String> str = String::toLowerCase;
        str.accept("asdfasdfasdf");

    }
}
