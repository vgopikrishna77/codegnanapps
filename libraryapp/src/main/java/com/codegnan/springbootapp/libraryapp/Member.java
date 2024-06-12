package com.codegnan.springbootapp.libraryapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Member {
 
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String role;  // ROLE_USER or ROLE_ADMIN
    
	/*
	 * public Member(Long memberId) { id=memberId; }
	 */
}
