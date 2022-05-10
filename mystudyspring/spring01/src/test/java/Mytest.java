import com.chenll.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @program: mystudyspring
 * @description:
 * @author: chen_ll
 * @create: 2022-05-02 00:38
 **/
public class Mytest {
    @Test
    public void test01(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }
}
