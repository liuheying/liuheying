package com.lhy.entity;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Fenye {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<Book> rows;
	private Sousuo sousuo;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<Book> getRows() {
		return rows;
	}
	public void setRows(List<Book> rows) {
		this.rows = rows;
	}
	public Sousuo getSousuo() {
		return sousuo;
	}
	public void setSousuo(Sousuo sousuo) {
		this.sousuo = sousuo;
	}
	@Override
	public String toString() {
		return "Fenye [page=" + page + ", pageSize=" + pageSize + ", total="
				+ total + ", rows=" + rows + ", sousuo=" + sousuo + "]";
	}
	

}
