package com.lhy.entity;

import org.springframework.stereotype.Component;

@Component
public class Sousuo {
	private String bname;
	private double startPrice;
	private Double endPrice;
	private Integer categoryId;
	private String cname;
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(double startPrice) {
		this.startPrice = startPrice;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	
	@Override
	public String toString() {
		return "Sousuo [bname=" + bname + ", startPrice=" + startPrice
				+ ", endPrice=" + endPrice + ", categoryId=" + categoryId
				+ ", cname=" + cname + "]";
	}
	
	

}
