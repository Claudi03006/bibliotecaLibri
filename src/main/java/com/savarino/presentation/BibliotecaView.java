package com.savarino.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.savarino.entities.Book;

@Controller
public class BibliotecaView {
	@GetMapping("/mostraLibri")
	public String showBooks(Book b) {
		return "m";
	}
@GetMapping("/showBooks")
	public String showAllBooks() {
	   // il metodo deve restituire il nome della vista che rappresenta la nuova pagina
	   return "showBooks";
	}
	@GetMapping("/addBook")
	public String getHomePage() {
	  return "addBook";
	}
}
