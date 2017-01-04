package org.llsmp.model.dao.impl;

import org.llsmp.model.dao.EmployeeDao;
import org.llsmp.model.entity.Employee;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/4
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

    /**
     * 根据用户名密码查询用户
     *
     * @param employee 用户
     * @return 结果
     */
    public Employee findByUserNameAndPass(Employee employee) {
        System.out.println(employee.getUsername() + "/n" + employee.getPassword());
        String hql = "select  e from org.llsmp.model.entity.Employee e where e.username=? and e.password =?";
        List employeeList = this.getHibernateTemplate().find(hql, employee.getUsername(), employee.getPassword());

        if (employeeList.size() > 0) {
            return (Employee) employeeList.get(0);
        }

        return null;
    }
}
