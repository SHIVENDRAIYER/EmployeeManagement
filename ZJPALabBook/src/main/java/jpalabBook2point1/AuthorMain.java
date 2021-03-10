package jpalabBook2point1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class AuthorMain {
	
	public static void main(String[] args) {
		AuthorMain admin = new AuthorMain();
		admin.start();
	}
	void start() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("training-ms");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Author a1=new Author("Shivendra",null);
		em.persist(a1);
		Book b1=new Book("Detective",100);
		Book b2=new Book("Dr.Strange",200);
		em.persist(b1);
		em.persist(b2);
		Set<Book>book1=new HashSet<>();
		book1.add(b1);
		book1.add(b2);
		a1.setBooks(book1);
		em.merge(a1);
		
		Author a2=new Author("Iyer",null);
		em.persist(a2);
		Book b3=new Book("Jumanji",300);
		Book b4=new Book("CreepSchool",400);
		em.persist(b3);
		em.persist(b4);
	
		Set<Book>book2=new HashSet<>();
		book2.add(b3);
		book2.add(b4);
		a2.setBooks(book2);
		em.merge(a2);
	
		
		et.commit();
		
		em.close();
	}
	

}
