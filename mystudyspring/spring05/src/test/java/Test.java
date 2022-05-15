import com.chenll.aop.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test1(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beanss.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.search();
    }

    @org.junit.Test
    public void test2(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.add();
    }
}
