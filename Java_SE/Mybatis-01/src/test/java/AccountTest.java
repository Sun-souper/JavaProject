import com.qf.dao.AccountDao;
import com.qf.dao.EmployeeDao;
import com.qf.pojo.Account;
import com.qf.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountTest {

    @Test
    public void test01() throws IOException {
        //1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //3.创建SqlSession  true自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> list = accountDao.findAll();
        //5.打印
        System.out.println(list);

        //按照id查询
        Account account = new Account();
        account.setId(1);
        List<Account> list1 = accountDao.findByID(account);
        System.out.println(list1);

        //条件查询
        Account account1 = new Account();
        account1.setMoney(1000F);
        List<Account> list2 = accountDao.find(account1);
        System.out.println(list2);

        //修改
        Account account2 = new Account();
        account2.setId(1);
        account2.setName("Jack");
        account2.setMoney(3000F);
        accountDao.updateAccount(account2);

        //批量删除
        List<Integer> integers = new ArrayList<>();
        integers.add(6);
        integers.add(7);
        integers.add(8);
        accountDao.delete(integers);


        //提交
        sqlSession.commit();

        //关闭资源
        sqlSession.close();

    }

    @Test
    public void test02() throws IOException {
        //1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //3.创建SqlSession  true自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //插入数据
        Account account3 = new Account();
        account3.setName("Rouse");
        account3.setMoney(4000F);
        accountDao.insertAccount(account3);

        //提交
        sqlSession.commit();

        //查询所有
        List<Account> list = accountDao.findAll();
        //5.打印
        System.out.println(list);

    }

    /**
     * 多表联查
     */
    @Test
    public void test03() throws IOException {
        //1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSession工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //3.创建SqlSession  true自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
        //4.调用查询方法
        List<Employee> employees = employeeDao.selectEmployee();
        //5.打印
        System.out.println(employees);

        sqlSession.close();
    }

    /**
     * 一级缓存
     */
    @Test
    public void test04() throws IOException {
        //1.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //3.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        //5.
    }

}
