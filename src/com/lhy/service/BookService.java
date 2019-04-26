package com.lhy.service;

import java.util.List;

import com.lhy.entity.CategoryBook;
import com.lhy.entity.Fenye;

public interface BookService {
	/**
	 * 查询所有
	 * @param fenye
	 * @return
	 */
   Fenye selectBooks(Fenye fenye);
	  
	 /**
	  * 查询书籍分类
	  * @return
	  */
	List<CategoryBook> selectCategoryBook();

}
