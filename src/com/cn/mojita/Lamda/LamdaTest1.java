package com.cn.mojita.Lamda;

import java.util.Comparator;

import org.junit.Test;

public class LamdaTest1 {

    //写出对两个元素进行比较的例子
    //匿名内部类实现
    @Test
    public void test1() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(1,2));
    }

    //使用Lamda表达式进行实现
    @Test
    public void test2() {
        Comparator<Integer> comparator = (x1,x2) -> x1.compareTo(x2);
        System.out.println(comparator.compare(1,2));

    }

    @Test
    public void test3() {
        Comparator<Integer> comparator = (Integer x1,Integer x2)->{
            x1 += 2;
            x2 -= 1;
            System.out.println("Hello Lamda");
            int value = x1.compareTo(x2);
            return value;
        };
        System.out.println(comparator.compare(1,2));
    }
}
