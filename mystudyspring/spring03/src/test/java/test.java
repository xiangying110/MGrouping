import com.chenll.Myconfig.MyConfig;
import com.chenll.spring.Dog;
import com.chenll.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: mystudy-spring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-08 22:18
 **/
public class test {


    @Test
    public  void  test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = (Dog) applicationContext.getBean("dog");
        System.out.println(dog.name);
    }
}
