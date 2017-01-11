package org.llsmp.model.server;

import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.Employee;
import org.llsmp.model.entity.PageBean;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/4
 */
public interface EmployeeService {
    Employee login(Employee employee);

    boolean addEmployee(Employee employee);

    Employee getEmployeeBySid(Integer eid);

    PageBean<Employee> findByPage(int currPage);

    void update(Employee employee);
}
