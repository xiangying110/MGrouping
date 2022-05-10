package com.chenll.spring;

/**
 * @program: mystudy-spring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-10 00:26
 **/
//真实角色: 房东，房东要出租房子
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
