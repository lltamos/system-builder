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
public class DepartmentAction extends SuperAction implements ModelDriven {

    private Department department = new Department();
    private int currPage = 1;
    @Resource
    private DepartmentService departmentService;


    public void setCurrentPage(int currPage) {
        this.currPage = currPage;
    }



    public String findAll() {
        System.out.println("findAll"+currPage);

        PageBean<Department> pageBean = departmentService.findByPage(currPage);

        ActionContext.getContext().getValueStack().push(pageBean);
        return "find_All";
    }

    public Object getModel() {
        return department;
    }
}
