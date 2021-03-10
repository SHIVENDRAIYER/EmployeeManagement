package jpalabBook2point2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.*;

public class AuthorMain {

	public static void main(String[] args) {
		AuthorMain admin = new AuthorMain();
		admin.start();
	}

	void start() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-ms");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		Author a1 = new Author("Shivendra", null);
		em.persist(a1);
		Book b1 = new Book("Detective", 100);
		Book b2 = new Book("Dr.Strange", 200);
		em.persist(b1);
		em.persist(b2);
		Set<Book> book1 = new HashSet<>();
		book1.add(b1);
		book1.add(b2);
		a1.setBooks(book1);
		em.merge(a1);

		Author a2 = new Author("Iyer", null);
		em.persist(a2);
		Book b3 = new Book("Jumanji", 300);
		Book b4 = new Book("CreepSchool", 400);
		em.persist(b3);
		em.persist(b4);

		Set<Book> book2 = new HashSet<>();
		book2.add(b3);
		book2.add(b4);
		a2.setBooks(book2);
		em.merge(a2);

		et.commit();

		em.close();
	}

	void displayAllBooks(EntityManager em) {

		String ql = "from Book";
		TypedQuery<Book> query = em.createQuery(ql, Book.class);
		List<Book> list = query.getResultList();
		System.out.println("----  Printing all books in database  ---");
		System.out.println();
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();

	}

	void displayBooksBetweenPrice(EntityManager em) {

		System.out.println("List all books with given price range. e.g. between Rs. 500 to 1000");
		System.out.println();
		String ql = "from Book where price between 500 and 1000";
		TypedQuery<Book> query = em.createQuery(ql, Book.class);
		List<Book> list = query.getResultList();
		for (Book b : list) {
			System.out.println(b);
		}
		System.out.println();

	}

	void displayBookByName(String name, EntityManager em) {

		System.out.println("Query all books written by given author name");
		System.out.println();
		String ql = "select authorId from Author where = :name";
		TypedQuery<Integer> query = em.createQuery(ql, Integer.class);

	}

	void ListAuthorName(EntityManager em) {

		System.out.println("List the author name for given book id");
		System.out.println();
		String ql = "from Author where f= :name";
		TypedQuery<Integer> query = em.createQuery(ql, Integer.class);
		System.out.print(query.getSingleResult());
		List<String> list = query.getResultList();
		for (String name : list) {
			System.out.println(name);
		}

	}

}
