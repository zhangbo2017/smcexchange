package com.smc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author BoZhang
 * E-mail:dlzbo@cn.ibm.com
 * @version date：May 12, 2020 7:57:20 PM
*/
@Entity
@Table(name = "stockexchange")
public class StockExchangeEntity extends AuditEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer exchangeid;

	@Column(name = "stockexchange")
	private String stockExchange;

	@Column(name = "exbrief")
	private String brief;

	@Column(name = "contactnum")
	private String contactnum;

	@Column(name = "address")
	private String address;

	@Column(name = "exremarks")
	private String remarks;

	public StockExchangeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getExchangeid() {
		return exchangeid;
	}

	public void setExchangeid(Integer exchangeid) {
		this.exchangeid = exchangeid;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactnum() {
		return contactnum;
	}

	public void setContactnum(String contactnum) {
		this.contactnum = contactnum;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
