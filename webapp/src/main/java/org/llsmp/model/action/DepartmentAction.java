package org.llsmp.model.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.PageBean;
import org.llsmp.model.server.DepartmentService;

import javax.annotation.Resource;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/5
 */
public class DepartmentAction extends SuperAction implements ModelDriven<Department> {

    private Department department = new Department();
    private int currPage = 1;
    @Resource
    private DepartmentService departmentService;

    public Department getModel() {
        return department;
    }


    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    /**
     * 分页部门查询
     */
    public String findAll() {


        PageBean<Department> pageBean = departmentService.findByPage(currPage);

        ActionContext.getContext().getValueStack().push(pageBean);

        return "find_All";
    }

    /**
     * 添加部门
     */
    public String addDepartment() {
        departmentService.savePartment(department);
        return "department_save_success";
    }

    /**
     * 跳转添加部门界面
     */
    public String skipeSaveUI() {
        return "skip_save_ui";
    }

}
