package com.lhy.service;

import java.util.List;

import com.lhy.entity.CategoryBook;
import com.lhy.entity.Fenye;

public interface BookService {
	/**
	 * ��ѯ����
	 * @param fenye
	 * @return
	 */
   Fenye selectBooks(Fenye fenye);
	  
	 /**
	  * ��ѯ�鼮����
	  * @return
	  */
	List<CategoryBook> selectCategoryBook();

}
