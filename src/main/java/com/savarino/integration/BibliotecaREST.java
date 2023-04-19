package com.savarino.integration;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.Book;
import com.savarino.entities.Customer;
import com.savarino.services.BookService;
import com.savarino.services.CustomerService;

@RestController
@RequestMapping("api")
public class BibliotecaREST {
	@Autowired
	BookService bookService;
	@Autowired
	CustomerService customerService;
	@GetMapping("books")
	List<Book> getAllBook(){
		return bookService.getBook();
	}
	@GetMapping("customers")
	List<Customer>getAllCustomer(){
		return customerService.getCustomer();
	}
	@PostMapping(value = "/addBook",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addBook(@ModelAttribute Book b){
		bookService.addBook(b);
		return ResponseEntity.status(HttpStatus.CREATED).body("libro aggiunto con successo");
	}
	@PostMapping(value = "/addCustomer",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>addCustomer(@ModelAttribute Customer c){
		customerService.addCustomer(c);
		return ResponseEntity.status(HttpStatus.CREATED).body("customer aggiunto con successo");
	}
}
