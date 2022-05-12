import com.chenll.aop.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beanss.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.search();
    }

    @Test
    public void test2(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService)
                context.getBean("userService");
        userService.add();
    }
}
