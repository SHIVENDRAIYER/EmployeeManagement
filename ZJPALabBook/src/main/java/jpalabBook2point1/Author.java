package jpalabBook2point1;

import javax.persistence.*;
import java.util.*;
public class Author {
	
	@GeneratedValue
	@Id
	int authorId;

	String name;

	@OneToMany
	Set<Book> books;

	public Author(String name, Set<Book> books) {
		this.name = name;
		this.books = books;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		
		this.authorId = authorId;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public Set<Book> getBooks() {
		
		return books;
	}

	public void setBooks(Set<Book> books) {
		
		this.books = books;
	}

	@Override
	public String toString() {
		
		return "Author [authorId=" + authorId + ", name=" + name + "]";
	}


}
