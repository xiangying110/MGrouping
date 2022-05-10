import com.chenll.springbean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: mystudyspring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-08 00:24
 **/
public class Mytest {
    @Test
    public void test(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = applicationContext.getBean("user", User.class);
        user.getCat().shout();

    }
}
