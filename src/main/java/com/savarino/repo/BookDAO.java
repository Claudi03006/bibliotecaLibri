package com.savarino.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Book;



public interface BookDAO  extends JpaRepository<Book, Integer>{

}
