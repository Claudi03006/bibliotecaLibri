package com.savarino.services;


import java.util.List;

import com.savarino.entities.Book;


public interface BookService {

List<Book>getBook();
void addBook(Book b);
}
