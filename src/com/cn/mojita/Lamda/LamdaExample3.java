package com.cn.mojita.Lamda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * Created by lijunhong on 17/9/17.
 */
public class LamdaExample3 {

    //时间判断
    @Test
    public void test() {
        ILamdaExample3 lamda = (date)->{
            String dateStr = "2008-08-08";
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Long time = format.parse(dateStr).getTime();
                Long dateTime = date.getTime();
                if(dateTime > time) {
                    System.out.println("大于"+dateStr);
                    return true;
                }
                System.out.println("小于等于"+dateStr);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return false;
        };
        System.out.println(lamda.dateJudge(new Date()));
    }
}
