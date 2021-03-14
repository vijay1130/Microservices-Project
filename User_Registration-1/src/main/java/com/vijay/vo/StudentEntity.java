package com.vijay.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
	
	private Integer studentId;
	private String  studentName;
	private String  studentAddress;
	private Long    studentPhone;

}
