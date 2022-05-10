package com.chenll.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: mystudy-spring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-08 22:13
 **/
@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
    @Value("咯")
    // 相当于配置文件中 <property name="name" value="陈令龙"/>
    public String name="chenll";
    @Value("咯2")
    public void setName(String name) {
        this.name = name;
    }
}
