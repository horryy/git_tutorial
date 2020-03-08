package test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class TestMyBatis {

    @Test
    public void run1() throws Exception{

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建一个SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //创建一个SqlSession对象
        SqlSession session = factory.openSession();

        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        //查询所有数据
        List<Account> list = dao.findAll();
        for (Account account:list){
            System.out.println(account);
        }

        //关闭资源
        session.close();
        in.close();


    }

    @Test
    public void run2() throws Exception{

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //创建一个SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //创建一个SqlSession对象
        SqlSession session = factory.openSession();

        //获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);

        //查询所有数据
        Account account = new Account();
        account.setMoney(400d);
        account.setName("熊大");
        dao.saveAccount(account);

        //提交事务
        session.commit();

        //关闭资源
        session.close();
        in.close();


    }


}
