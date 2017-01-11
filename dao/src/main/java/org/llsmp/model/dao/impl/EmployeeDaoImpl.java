package org.llsmp.model.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.llsmp.model.dao.EmployeeDao;
import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.Employee;
import org.llsmp.model.entity.PageBean;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
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
        String hql = "select  e from org.llsmp.model.entity.Employee e where e.username=? and e.password =?";
        List employeeList = this.getHibernateTemplate().find(hql, employee.getUsername(), employee.getPassword());
        if (employeeList.size() > 0) {
            return (Employee) employeeList.get(0);
        }

        return null;
    }

    /**
     * @param employee 需要保存的员工
     */
    public boolean saveEmployee(Employee employee) {
        try {
            this.getHibernateTemplate().save(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Employee queryEmployeeBySid(Integer eid) {
        String hql = "select e from org.llsmp.model.entity.Employee e where e.eid=?";
        List employees = this.getHibernateTemplate().find(hql, eid);
        return (Employee) employees.get(0);
    }

    //查询总记录
    public int findCount() {
        String hql = "select count (*) from org.llsmp.model.entity.Employee";
        List<Long> employees = (List<Long>) this.getHibernateTemplate().find(hql);

        if (employees.size() > 0) {
            return employees.get(0).intValue();
        }
        return 0;
    }
    /**
     * 分页查询部门
     *
     * @param begin    开始位置
     * @param employeePageBean 分页参数
     * @return 返回部门结果
     */
    public List<Employee> findPage(int begin, PageBean<Employee> employeePageBean) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Employee.class);
        List<Employee> byCriteria = (List<Employee>) this.getHibernateTemplate().findByCriteria(detachedCriteria, begin, employeePageBean.getPageSize());
        return byCriteria;
    }

    public void update(Employee employee) {
        this.getHibernateTemplate().update(employee);
    }

}
