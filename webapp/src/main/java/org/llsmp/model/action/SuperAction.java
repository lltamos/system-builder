package org.llsmp.model.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/28
 */
public class SuperAction extends ActionSupport implements ServletContextAware, ServletResponseAware, ServletRequestAware {
    protected HttpServletResponse response;
    protected HttpServletRequest request;
    protected HttpSession session;
    protected ServletContext context;

    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    public void setServletContext(ServletContext context) {
        this.context = context;

    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
        this.session = request.getSession();
    }
}
