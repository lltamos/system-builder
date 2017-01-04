package org.llsmp.model.action;

import com.opensymphony.xwork2.ModelDriven;
import org.llsmp.model.server.EmployeeService;
import org.llsmp.model.entity.Employee;

import javax.annotation.Resource;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/4
 * 员工管理action
 */


public class EmployeeAction extends SuperAction implements ModelDriven<Employee> {
    @Resource
    private EmployeeService employeeService;

    private Employee employee = new Employee();

    public String login() {
        System.out.println("login....");
        Employee existEmployee = employeeService.login(employee);

        if (existEmployee==null){
            this.addActionError("error！");
            return INPUT;
        }else {
            session.setAttribute("existEmployee",existEmployee);
            return SUCCESS;
        }

    }

    public Employee getModel() {
        return employee;
    }
}
