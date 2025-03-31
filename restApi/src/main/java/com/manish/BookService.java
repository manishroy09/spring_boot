package com.manish;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class BookService {
private static List<Book> list=new ArrayList<Book>();
static {
	list.add(new Book(101, "Java Book", "Ram"));
	list.add(new Book(102, "python Book", "deepak"));
	list.add(new Book(103, "DotNet Book", "shivam"));
	
}
public List<Book> getAllBook(){
	return list;
}

public Book getBookById(int id) {
	Book k=new Book();
	for(Book b:list) {
		if(b.getId()==id) {
			k=b;
		}
	}
	return k;
}

public void addBook(Book b) {
	list.add(b);
}
public void deleteBookById(int id) {
	for(int i=0;i<list.size();i++) {
		if(id==list.get(i).getId()) {
			list.remove(i);
			System.out.println("Data Delete success");
		}
	}
}
public void updateBookById(Book book,int id) {
	for(int i=0;i<list.size();i++) {
		if(id==list.get(i).getId()) {
			list.set(i, book);
			System.out.println("Data update success");
		}
	}
}

}




