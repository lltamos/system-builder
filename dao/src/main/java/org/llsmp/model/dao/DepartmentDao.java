package org.llsmp.model.dao;

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
public interface DepartmentDao {
    int findCount();

    List<Department> findByPage(int begin, PageBean<Department> pageBean);

   void saveDeparment(Department department);


    List<Department> findAll();
}
