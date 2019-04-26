package com.lhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhy.dao.BookMapper;
import com.lhy.entity.Book;
import com.lhy.entity.CategoryBook;
import com.lhy.entity.Fenye;
@Service
public class BookServiceImp implements BookService {
	@Autowired
	private BookMapper bookMapper;
   /*分页查询*/
	@Override
	public Fenye selectBooks(Fenye fenye) {
		List<Book> selectBook = bookMapper.selectBook(fenye);
		Integer count = bookMapper.selectBookCount(fenye);
		fenye.setRows(selectBook);
		fenye.setTotal(count);
		return fenye;
	}
    /*查询书籍分类*/
	@Override
	public List<CategoryBook> selectCategoryBook() {
		// TODO Auto-generated method stub
		return bookMapper.selectCategoryBook();
	}

}
