package org.llsmp.model.server.impl;

import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.Employee;
import org.llsmp.model.entity.PageBean;
import org.llsmp.model.server.EmployeeService;
import org.llsmp.model.dao.EmployeeDao;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
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
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    /**
     * 根据用户名密码查询用户
     *
     * @param employee 员工
     */
    public Employee login(Employee employee) {
        return employeeDao.findByUserNameAndPass(employee);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public boolean addEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    public Employee getEmployeeBySid(Integer eid) {
        return employeeDao.queryEmployeeBySid(eid);
    }


    public PageBean<Employee> findByPage(int currPage) {
        PageBean<Employee> pageBean = new PageBean<Employee>();
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        pageBean.setCurrentPage(currPage);
        //封装总记录数
        int totalCount = employeeDao.findCount();

        pageBean.setTotalCount(totalCount);
        //封装总页数

        double tc = totalCount;

        Double totalPage = Math.ceil(tc / pageSize);
        System.out.println("totalPage:" + totalPage);
        pageBean.setTotalPage(totalPage.intValue());
        //封装每页的记录
        int begin = (currPage - 1) * pageSize;
        List<Employee> departments = employeeDao.findPage(begin, pageBean);
        pageBean.setData(departments);
        return pageBean;
    }
}
