import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void findAllUser() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mybatis-spring.xml");
        //2.获取类对象
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        //3.调用方法
        List<User> users = userServiceImpl.findAll();
        //4.打印
        System.out.println(users);
    }
}
