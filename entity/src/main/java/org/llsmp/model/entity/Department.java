package org.llsmp.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2017/1/4
 */
@Entity
@Table
public class Department {
    @Id
    @GeneratedValue
    private Integer did;

    @Column(unique = true, length = 20)
    private String dname;

    @Column(length = 50)
    private String ddesc;

    //员工集合
    @OneToMany(targetEntity = Employee.class,  fetch = FetchType.LAZY, mappedBy = "department")
    private Set<Employee> employees = new HashSet<Employee>();


    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }


    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }


    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
