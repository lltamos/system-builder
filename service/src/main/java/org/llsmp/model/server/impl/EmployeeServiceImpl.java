package org.llsmp.model.server.impl;

import org.llsmp.model.entity.Employee;
import org.llsmp.model.server.EmployeeService;
import org.llsmp.model.dao.EmployeeDao;

import javax.annotation.Resource;

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
     * @param employee
     * @return
     */
    public Employee login(Employee employee) {
        return employeeDao.findByUserNameAndPass(employee);
    }
}
