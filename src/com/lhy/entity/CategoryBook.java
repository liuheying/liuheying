package com.lhy.entity;

import org.springframework.stereotype.Component;

@Component
public class CategoryBook {
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
	@Override
	public String toString() {
		return "CategoryBook [categoryId=" + categoryId + ", cname=" + cname
				+ "]";
	}
	

}
