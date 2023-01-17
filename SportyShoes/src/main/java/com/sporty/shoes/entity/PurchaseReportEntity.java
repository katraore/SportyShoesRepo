package com.sporty.shoes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column
	private String category;
	
	@Column
	private Date dop;
	
	public PurchaseReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PurchaseReportEntity(int id, String category, Date dop) {
		super();
		this.id = id;
		this.category = category;
		this.dop = dop;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}

	
}
