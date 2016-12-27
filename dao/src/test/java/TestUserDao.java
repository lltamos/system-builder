
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.llsmp.model.dao.GenericDao;
import org.llsmp.model.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/27
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUserDao {


    @Test
    public void testSave() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        GenericDao dao = (GenericDao) ctx.getBean("genericDaoImpl");
        User user = new User();
        user.setName("张文辉");
        user.setPassword("23");
        dao.save(user);
    }
}
