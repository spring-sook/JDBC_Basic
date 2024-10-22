package vo;
// VO(Value Object) : 데이터베이스에서 가져온 레코드(튜플)를 자바 객체로 매핑하는 데 사용
// VO 객체는 데이터베이스 테이블의 각 컬럼에 해당하는 멤버변수(인스턴스 필드)를 만듦
// 일반적으로 데이터베이스 테이블의 레코드 한행을 객체로 매핑하기 위해 사용
// VO 객체는 로직을 가지지 않고 순수하게 데이터를 전달하는 용도로 사용

import java.math.BigDecimal;
import java.sql.*;

public class EmpVO {
    private int empNo; // 사원번호
    private String name; // 사원이름
    private String job;
    private int mgr;
    private Date date;
    private BigDecimal sal;
    private BigDecimal comm;
    private int deptNo;

    public EmpVO(int empNo, String name, String job, int mgr, Date date, BigDecimal sal, BigDecimal comm, int deptNo) {
        this.empNo = empNo;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.date = date;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public EmpVO(String name, String job, BigDecimal sal, BigDecimal comm) {
        this.name = name;
        this.job = job;
        this.sal = sal;
        this.comm = comm;
    }

    public EmpVO() {
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getMgr() {
        return mgr;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
}
