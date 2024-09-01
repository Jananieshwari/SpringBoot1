package com.tns.CertificateService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cspring")
public class Certificate
{
	@Id
	@Column(name="Cid")
	private int id;
	@Column(name="Cname")
	private String name;
	@Column(name="CissuedBy")
	private String issuedBy;
	@Column(name="CissuedDate")
	private String issuedDate;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int id, String name, String issuedBy, String issuedDate) {
		super();
		this.id = id;
		this.name = name;
		this.issuedBy = issuedBy;
		this.issuedDate = issuedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + ", issuedBy=" + issuedBy + ", issuedDate=" + issuedDate
				+ "]";
	}
	
	

}
