package com.chenll.springbean;


import com.chenll.springbean.Cat;
import com.chenll.springbean.Dog;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: mystudyspring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-07 22:45
 **/
public class User {
    //如果允许对象为null，设置required = false,默认为true
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;
    private  String str;

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", str='" + str + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
