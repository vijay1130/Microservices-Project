package com.vijay.vo;

import com.vijay.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempletVo {

	private User user;
	private StudentEntity entity;
}
