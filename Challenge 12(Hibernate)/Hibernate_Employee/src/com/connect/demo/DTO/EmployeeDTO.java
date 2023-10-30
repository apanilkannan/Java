package com.connect.demo.DTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeDTO {

    @Id
    @GenericGenerator(name = "ref", strategy = "increment")
    @GeneratedValue(generator = "ref")
    @Column(name = "EMPNO")
    private long empno;

    @Column(name = "ENAME")
    private String ename;

    @Column(name = "SAL")
    private int sal;

    @Column(name = "JOB")
    private String job;

    @Column(name = "DEPTNO")
    private int deptno;

    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return this.empno + " | " + this.ename + " | " + this.sal + " | " + this.job + " | " + this.deptno;
    }
}
