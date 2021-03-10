package jpalabBook1;

import javax.persistence.*;

public class AuthorMain {

	EntityManager entityManager;

	public static void main(String[] args) {

		AuthorMain admin = new AuthorMain();
		admin.start();

	}

	void start() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("training-ms");
		entityManager = emf.createEntityManager();

		Author william = new Author("William", "Shakespeare", "MerchantOfVenice", 987651434);
		add(william);
		display(william);

		Author rowling = new Author("J", "K", "Rowling", 878615421);
		add(rowling);
		display(rowling);

		rowling.setPhoneNo(878645421);
		update(rowling);
		display(rowling);

		displayById(1);

		delete(rowling);
	}

	public void add(Author author) {

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(author);
		transaction.commit();
		System.out.println("Author added");
	}

	public void update(Author author) {

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(author);
		transaction.commit();
		System.out.println("Updated");
	}

	public void displayById(int authorId) {

		Author author = entityManager.find(Author.class, authorId);
		display(author);
	}

	public void delete(Author author) {

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(author);
		transaction.commit();
		System.out.println("Author " + author.getFirstName() + " removed");
	}

	public void display(Author author) {

		System.out.println("Author " + author.getAuthorId() + ": " + author.getFirstName() + " "
				+ author.getMiddleName() + " " + author.getLastName() + " " + author.getPhoneNo());
	}

}
