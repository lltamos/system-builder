package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.llsmp.model.dao.GenericDao;
import org.llsmp.model.entity.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestUserDao {

    @Resource
    GenericDao dao;
    @Test
    public void testSave() {
        User user = new User();
        user.setName("张文11");
        user.setPassword("23");
        dao.save(user);
    }
}
