package org.llsmp.model.dao;

import org.llsmp.model.entity.Employee;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/4
 */
public interface EmployeeDao  {
    Employee findByUserNameAndPass(Employee employee);
}
