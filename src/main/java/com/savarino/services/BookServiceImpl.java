package com.savarino.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savarino.entities.Book;
import com.savarino.repo.BookDAO;

@Service
public class BookServiceImpl  implements BookService{

	@Autowired
	BookDAO dao;

	@Override
	public List<Book> getBook() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		dao.save(b);
		
	}

	


	

	

}
