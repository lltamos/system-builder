package org.llsmp.model.dao.impl;

import org.llsmp.model.dao.GenericDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/27
 */

@Service
@Transactional
public class GenericDaoImpl extends HibernateDaoSupport implements GenericDao {

    public <T> void save(T t) {
        getHibernateTemplate().save(t);
    }

    public <T> void delete(T t) {
        getHibernateTemplate().delete(t);
    }

    public <T> void update(T t) {
        getHibernateTemplate().update(t);
    }

    public <T> T findById(Class<T> clazz, int id) {
        return getHibernateTemplate().get(clazz, id);
    }
}
