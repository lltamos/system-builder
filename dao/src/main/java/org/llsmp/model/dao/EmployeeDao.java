package org.llsmp.model.dao;

import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.Employee;
import org.llsmp.model.entity.PageBean;

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
public interface EmployeeDao {
    Employee findByUserNameAndPass(Employee employee);

    boolean saveEmployee(Employee employee);

    Employee queryEmployeeBySid(Integer eid);

    int findCount();

    List<Employee> findPage(int begin, PageBean<Employee> employeePageBean);
}
