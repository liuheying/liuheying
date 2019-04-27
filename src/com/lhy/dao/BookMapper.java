package com.lhy.dao;

import java.util.List;

import com.lhy.entity.Book;
import com.lhy.entity.CategoryBook;
import com.lhy.entity.Fenye;

public interface BookMapper {
	/**
	 * ��ҳ��ѯ
	 * @param fenye
	 * @return
	 */
	List<Book> selectBook(Fenye fenye);
	/**
	 * ��ѯ������
	 * @param fenye
	 * @return
	 */
Integer selectBookCount(Fenye fenye);
	
	/**
	 * ��ѯ�鼮����
	 * @return
	 */
	List<CategoryBook> selectCategoryBook();
}
