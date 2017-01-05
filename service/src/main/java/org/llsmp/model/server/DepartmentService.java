package org.llsmp.model.server;

import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.PageBean;

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
}
