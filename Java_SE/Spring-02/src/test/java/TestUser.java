import com.qf.domarn.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userDaoService = context.getBean("userServiceImpl", UserService.class);
        userDaoService.findById(1);
        User user = (User) context.getBean("user");
        String string = user.toString();
        System.out.println(string);
    }
}
