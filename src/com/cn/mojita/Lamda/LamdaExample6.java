package com.cn.mojita.Lamda;

import java.util.function.Function;

import org.junit.Test;


public class LamdaExample6 {

    //拼接sql工具类
    public String appedSql(Student student,String sql,
                           Function<Student,String> whereSql,
                           Function<Student,String> groupBy,
                           Function<Student,String> desc) {
        StringBuffer sb = new StringBuffer();
        sb.append(sql);
        String sqlTemp = null;

        if(whereSql != null) {
            sqlTemp = whereSql.apply(student);
            if (sqlTemp != null)
                sb.append(sqlTemp);
        }

        if(groupBy != null) {
            sqlTemp = groupBy.apply(student);
            if (sqlTemp != null)
                sb.append(sqlTemp);
        }

        if(desc != null) {
            sqlTemp = desc.apply(student);
            if (sqlTemp != null)
                sb.append(sqlTemp);
        }
        return sb.toString();
    }



    //实验拼接
    @Test
    public void test() {
        Student student = new Student();
        student.setId(1);
        student.setClassNum("4班");
        student.setName("张三");
        student.setAge(19);
        //例子一:SELECT * FROM student WHERE id=1;
        String sql11 = "SELECT * FROM student";
        String sql12 = appedSql(student,sql11,
                (queryWhere)->{
                    StringBuffer sb = new StringBuffer();
                    sb.append(" Where");
                    if(queryWhere.getId() > 0)
                        sb.append(" id="+queryWhere.getId());
                    else
                        return null;
                    return sb.toString();
                },
                null,null);
        System.out.println(sql12);

        //例子二:SELECT id AS id,name AS userName Where age = 18 GROUP BY classNum;

        String sql21 = "SELECT id AS id,name AS userName";
        String sql22 = appedSql(student,sql21,
                (queryWhere)->{
                    StringBuffer sb = new StringBuffer();
                    sb.append(" WHERE");
                    if(queryWhere.getAge() > 0 && queryWhere.getAge() < 150)
                        sb.append(" age="+queryWhere.getAge());
                    else
                        return null;
                    return sb.toString();
                },
                (queryGroup)->{
                    StringBuffer sb = new StringBuffer();
                    sb.append(" Group BY");
                    if(queryGroup.getClassNum() != null)
                        sb.append(" '"+queryGroup.getClassNum()+"'");
                    else
                        return null;
                    return sb.toString();
                },null);
        System.out.println(sql22);


    }
}
