package com.chenll.spring;

/**
 * @program: mystudy-spring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-10 00:34
 **/
//客户类，一般客户都会去找代理！
public class Client {
    public static void main(String[] args) {
//房东要租房
        Host host = new Host();
//中介帮助房东
        Proxy proxy = new Proxy(host);
//你去找中介！
        proxy.rent();
    }
}
