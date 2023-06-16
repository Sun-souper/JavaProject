
import com.qf.Service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    @Test
    public void test01() {
        //1.加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.创建对象
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        //3.调用方法
        userServiceImpl.findById();
    }
}
