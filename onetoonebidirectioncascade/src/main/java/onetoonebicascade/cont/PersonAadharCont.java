package onetoonebicascade.cont;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebicascade.dto.Aadharcard;
import onetoonebicascade.dto.Person;

public class PersonAadharCont {

	public static void main(String[] args) {
		
		Person p =new Person();
		p.setId(2);
		p.setName("Nikhil");

		Aadharcard a = new Aadharcard();
		a.setId(200);
		a.setName("Nikhil");
		
		p.setAadharcard(a);
		a.setPerson(p);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(a);
		entityTransaction.commit();
	}

}
