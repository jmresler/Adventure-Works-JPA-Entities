package org.jmresler.spring.aw.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.testng.annotations.Test;

public class VAdditionalContactInfoTest {
	
	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("aw-entities-pu");
	protected EntityManager em = emf.createEntityManager();
	
	@Test
	public void getAllViewsAdditionalContactInfo() {
		Query query = em.createNamedQuery("VAdditionalContactInfo.findAll");
		query.getResultList().forEach(System.out::println);
	}
	
	@Test
	public void getSpecificViewsAdditionalContactInfo() {
		Query query = em.createNamedQuery("VAdditionalContactInfo.findByBusinessEntityID");
		query.setParameter("businessEntityID", Integer.valueOf("1"));
		System.err.println("--------------------------------------------------------------");
		query.getResultList().forEach(System.out::println);
	}

}
