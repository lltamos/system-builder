package org.llsmp.model.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.PageBean;
import org.llsmp.model.server.DepartmentService;
import org.llsmp.model.server.EmployeeService;
import org.llsmp.model.entity.Employee;

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
 * 员工管理action
 */


public class EmployeeAction extends SuperAction implements ModelDriven<Employee> {
    @Resource
    private EmployeeService employeeService;
    @Resource
    private DepartmentService departmentService;
    private Employee employee = new Employee();

    private int currPage = 1;

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public String login() {

        Employee existEmployee = employeeService.login(employee);

        if (existEmployee == null) {
            this.addActionError("error！");
            return "login_fail";
        } else {
            session.setAttribute("existEmployee", existEmployee);
            return "login_secess";
        }

    }

    /**
     * 保存员工
     */
    public String saveEmployee() {
        employeeService.addEmployee(employee);
        return "save_sucess";

    }


    /**
     * 编辑员工
     */
    public String editEmployee() {
        System.out.println("编辑员工");
        return NONE;
    }

    /**
     * 跳转添加员工界面
     */
    public String addEmployeeUI() {
        List<Department> list = departmentService.findAll();
        ActionContext.getContext().getValueStack().set("list", list);
        return "skip_add_save";
    }


    /**
     * 分页显示员工
     */
    public String findAll() {
        //封装分页bean
        PageBean<Employee> pageBean = employeeService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);

        return "find_all";
    }

    public Employee getModel() {
        return employee;
    }
}
