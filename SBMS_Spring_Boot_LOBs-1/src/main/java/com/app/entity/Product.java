package com.app.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;



@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@Column(name="pid")
	private Integer prodId;

	@Column(name="pcode")
	private String prodCode;
	
	@Column(name="pcost")
	private Double prodCost;
	
	@Lob
	@Column(name="pimg")
	private byte[] prodImg;
	
	@Lob
	@Column(name="pdesc")
	private char[] prodDesc;

	public Product() {
		super();
	}

	public Product(Integer prodId, String prodCode, Double prodCost, byte[] prodImg, char[] prodDesc) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
		this.prodImg = prodImg;
		this.prodDesc = prodDesc;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public byte[] getProdImg() {
		return prodImg;
	}

	public void setProdImg(byte[] prodImg) {
		this.prodImg = prodImg;
	}

	public char[] getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(char[] prodDesc) {
		this.prodDesc = prodDesc;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + ", prodImg="
				+ Arrays.toString(prodImg) + ", prodDesc=" + Arrays.toString(prodDesc) + "]";
	}
	
	
}
