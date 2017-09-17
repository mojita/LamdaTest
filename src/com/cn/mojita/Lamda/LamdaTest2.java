package com.cn.mojita.Lamda;

import java.util.Collection;
import java.util.Random;

import org.junit.Test;

/**
 * Created by lijunhong on 17/9/17.
 */
public class LamdaTest2 {

    //通过使用Lamda表达式,使用线程每一秒打印一个数字,数字随
    @Test
    public void test1() {
        Runnable runnable = () -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    Random random = new Random();
                    int value = random.nextInt(100);
                    System.out.println(value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        //运行
        runnable.run();
    }
}
