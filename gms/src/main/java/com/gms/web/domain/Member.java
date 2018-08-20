package com.gms.web.domain;

import lombok.Data;

@Data
public class Member {
	private String userId,
	ssn, 
	name,
	gender,
	age,
	roll, 
	teamId,
	password;
}
