package com.app.prav.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Table(name = "prodtab")
@Entity
public class Product {
	
	@Id
	@Column(name = "pid")
	private Integer prodId;
	@Column(name="pname")
	private String prodName;
	
	@ElementCollection
	@CollectionTable(
			name="prod_vendors",
			joinColumns = @JoinColumn(name="pidFk")
			)
	@Column(name="vendor")
	private Set<String> vendors;
	
	@ElementCollection
	@CollectionTable(
			name="prod_versions",
			joinColumns = @JoinColumn(name="pidFk")
			)
	@OrderColumn(name="pos")
	@Column(name="versions")
	private List<String> versions;
	
	
	@ElementCollection
	@CollectionTable(
				name = "prod_clients",
				joinColumns = @JoinColumn(name="pidFk")
			)
	
	@MapKeyColumn(name="code")
	@Column(name="clients")
	private Map<String,String> clients;


	public Product() {
		super();
	}


	public Product(Integer prodId, String prodName, Set<String> vendors, List<String> versions,
			Map<String, String> clients) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.vendors = vendors;
		this.versions = versions;
		this.clients = clients;
	}


	public Integer getProdId() {
		return prodId;
	}


	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public Set<String> getVendors() {
		return vendors;
	}


	public void setVendors(Set<String> vendors) {
		this.vendors = vendors;
	}


	public List<String> getVersions() {
		return versions;
	}


	public void setVersions(List<String> versions) {
		this.versions = versions;
	}


	public Map<String, String> getClients() {
		return clients;
	}


	public void setClients(Map<String, String> clients) {
		this.clients = clients;
	}
	
	
	
}
