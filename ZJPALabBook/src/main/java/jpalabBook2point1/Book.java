package jpalabBook2point1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	@GeneratedValue
	@Id
	int ISBN;
	
	String title;
	int price;
	
	public Book(String title, int price) {
		
		this.title = title;
		this.price = price;
	}
	
	public int getIsbn() {
		
		return ISBN;
	}
	public void setIsbn(int ISBN) {
		
		this.ISBN = ISBN;
	}
	public String getTitle() {
		
		return title;
	}
	public void setTitle(String title) {
		
		this.title = title;
	}
	public int getPrice() {
		
		return price;
	}
	public void setPrice(int price) {
		
		this.price = price;
	}

	@Override
	public String toString() {
		
		return "Book [isbn=" + ISBN + ", title=" + title + ", price=" + price + "]";
	}
	
	

}
