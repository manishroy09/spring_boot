package com.manish;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookController {
	@Autowired
	private BookService service;
	
public BookService getService() {
		return service;
	}
	public void setService(BookService service) {
		this.service = service;
	}
	//http://localhost:8080/books
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return this.service.getAllBook();
	}
	//http://localhost:8080/book/101
	@GetMapping("/book/{id}")
	public Book getBooksById(@PathVariable("id")int id) {
		
		return this.service.getBookById(id);
	}
	
	//http://localhost:8080/books
	@PostMapping("/books") 
	/*
 {"id":105,
    "title":"JavaScript",
    "author":"kartik"
    }


*/ 
	public void saveBook(@RequestBody Book book)  
	{  	System.out.println("Data add Success");
			 this.service.addBook(book);
		}
	//http://localhost:8080/books/105
	@PutMapping("/books/{id}")  
	public void updateBook(@RequestBody Book book,@PathVariable("id")int id)  
	{  	System.out.println("Data update Success");
			book.setId(id);
			 this.service.updateBookById(book, id);
		}
	//http://localhost:8080/book/103
		
@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable("id")int id) {
	System.out.println("Data Deleted Success");
		this.service.deleteBookById(id);
	}


	
}