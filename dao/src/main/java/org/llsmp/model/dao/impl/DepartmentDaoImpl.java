package org.llsmp.model.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.llsmp.model.dao.DepartmentDao;
import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.PageBean;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/5
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {
    public int findCount() {
        String hql = "select count (*) from org.llsmp.model.entity.Department";
        List<Long> list = (List<Long>) this.getHibernateTemplate().find(hql);

        if (list.size() > 0) {
            return  list.get(0).intValue();
        }
        return 0;
    }

    /**
     * 分页查询部门
     *
     * @param begin    开始位置
     * @param pageBean 分页参数
     * @return 返回部门结果
     */
    public List<Department> findByPage(int begin, PageBean<Department> pageBean) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
        List<Department> byCriteria = (List<Department>) this.getHibernateTemplate().findByCriteria(criteria, begin, pageBean.getPageSize());
        return byCriteria;
    }
}
