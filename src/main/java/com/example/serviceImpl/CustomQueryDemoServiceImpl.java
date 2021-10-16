package com.example.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Library;

@Service
public class CustomQueryDemoServiceImpl {

	@Autowired
	EntityManager entityManager;
	
	public List<Library> getLibWithTheseBooks(String commaSeperatedBookNames) {
		TypedQuery<Library> query = entityManager
				.createQuery("Select l from Library l where l.commaSeperatedBooknames = '"+ commaSeperatedBookNames + "'" , Library.class);
		return query.getResultList();
	}
	
	public List<Library> getLibWithNoBooks() {
		TypedQuery<Library> query = entityManager
				.createQuery("Select l from Library l where l.commaSeperatedBooknames = ''" , Library.class);
		return query.getResultList();
	}
}
