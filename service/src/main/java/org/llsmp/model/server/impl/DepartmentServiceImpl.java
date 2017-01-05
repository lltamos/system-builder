package org.llsmp.model.server.impl;

import org.llsmp.model.dao.DepartmentDao;
import org.llsmp.model.entity.Department;
import org.llsmp.model.entity.PageBean;
import org.llsmp.model.server.DepartmentService;

import javax.annotation.Resource;
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
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    public PageBean<Department> findByPage(int currPage) {
        PageBean<Department> pageBean = new PageBean<Department>();
        //封装当前页数
        pageBean.setCurrentPage(currPage);
        //封装每页显示记录数
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = departmentDao.findCount();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc / pageSize);
        pageBean.setTotalPage(num.intValue());
        //封装每页显示的记录数
        int begin = (currPage - 1) * pageSize;
        List<Department> list = departmentDao.findByPage(begin, pageBean);
        pageBean.setData(list);
        return pageBean;
    }
}
