package com.example.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class StudentWithCompositeKeyWithEmbeddableAnnotation {
	
	@EmbeddedId
	StudentIDWithEmbeddableAnnotation studentId;
	
	private String name;
}
