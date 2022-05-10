package com.chenll.spring;

/**
 * @program: mystudy-spring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-10 00:32
 **/
//代理角色：中介
public class Proxy implements Rent {
    private Host host;
//    无参构造器
    public Proxy() { }
//    有参构造器
    public Proxy(Host host) {
        this.host = host;
    }
    //租房
    @Override
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
