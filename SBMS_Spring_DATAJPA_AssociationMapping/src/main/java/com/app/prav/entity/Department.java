package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="deptab")

public class Department 
{
	
	@Id
	@Column(name="did")
	private Integer dpid;
	@Column(name="dcd")
	private String code;
	@Column(name="admin")
	private String deptAdmin;
	
	
	public Department() {
		super();
	
	}

	public Department(Integer dpid, String code, String deptAdmin) {
		super();
		this.dpid = dpid;
		this.code = code;
		this.deptAdmin = deptAdmin;
	}

	public Integer getDpid() {
		return dpid;
	}

	public void setDpid(Integer dpid) {
		this.dpid = dpid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDeptAdmin() {
		return deptAdmin;
	}

	public void setDeptAdmin(String deptAdmin) {
		this.deptAdmin = deptAdmin;
	}

	@Override
	public String toString() {
		return "Department [dpid=" + dpid + ", code=" + code + ", deptAdmin=" + deptAdmin + "]";
	}
	
}
