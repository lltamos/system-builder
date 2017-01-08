package org.llsmp.model.server;

import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.PageBean;

import java.util.List;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/5
 */
public interface DepartmentService {
    PageBean<Department> findByPage(int currPage);

    void savePartment(Department department);

    //查询所有部门
    List<Department> findAll();
}
