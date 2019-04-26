package com.lhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lhy.entity.CategoryBook;
import com.lhy.entity.Fenye;
import com.lhy.entity.Sousuo;
import com.lhy.service.BookService;

@Controller
public class BookController {
	@Autowired
    private BookService bookService;
	@Autowired
	 private Fenye fenye;
	
	@RequestMapping(value="/showBooks",method=RequestMethod.POST)
	@ResponseBody
   public Fenye selectStu(Integer page,Integer rows,Sousuo sousuo){
	fenye.setPage((page-1)*rows);
	fenye.setPageSize(rows);
	fenye.setSousuo(sousuo);
	fenye = bookService.selectBooks(fenye);
	return fenye;
}
	
	
	  /**
	   * ≤È—Ø∞‡º∂
	   * @return
	   */
	    @RequestMapping(value="/selectCategroy",method=RequestMethod.POST)
		@ResponseBody
		public List<CategoryBook> selectCategroy(){
			return bookService.selectCategoryBook();
		}
}
