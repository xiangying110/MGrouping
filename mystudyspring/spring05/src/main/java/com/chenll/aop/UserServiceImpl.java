package com.chenll.aop;

public  class UserServiceImpl implements UserService{


    public void add() {
        System.out.println("增加用户");
    }

    public void delete() {
        System.out.println("删除用户");
    }

    public void update() {
        System.out.println("更新用户");
    }
    public void search() {
        System.out.println("查询用户");
    }
}
