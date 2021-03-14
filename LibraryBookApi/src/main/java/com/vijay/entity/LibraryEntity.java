package com.vijay.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Library_Vijay")
public class LibraryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer libraryId;
	private String  libraryName;
	private String  libraryAddress;
	private Integer phoneId;  
	

}
