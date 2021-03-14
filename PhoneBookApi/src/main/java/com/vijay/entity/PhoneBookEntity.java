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
@Table(name = "PhoneBookEntity")
public class PhoneBookEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer phoneId;
	private String  phoneName;
	private String  phoneAddress;
	private String  phoneStatus;

}
