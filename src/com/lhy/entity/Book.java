package com.lhy.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private Integer id;
	private String name;
	private double price;
	private String writer;
	private String describtion;
	private CategoryBook categoryBook;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDescribtion() {
		return describtion;
	}
	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}
	public CategoryBook getCategoryBook() {
		return categoryBook;
	}
	public void setCategoryBook(CategoryBook categoryBook) {
		this.categoryBook = categoryBook;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price
				+ ", writer=" + writer + ", describtion=" + describtion
				+ ", categoryBook=" + categoryBook + "]";
	}
	
	

}
