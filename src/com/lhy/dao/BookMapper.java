package com.lhy.dao;

import java.util.List;

import com.lhy.entity.Book;
import com.lhy.entity.CategoryBook;
import com.lhy.entity.Fenye;

public interface BookMapper {
	/**
	 * 分页查询
	 * @param fenye
	 * @return
	 */
	List<Book> selectBook(Fenye fenye);
	/**
	 * 查询总条数
	 * @param fenye
	 * @return
	 */
Integer selectBookCount(Fenye fenye);
	
	/**
	 * 查询书籍分类
	 * @return
	 */
	List<CategoryBook> selectCategoryBook();
}
