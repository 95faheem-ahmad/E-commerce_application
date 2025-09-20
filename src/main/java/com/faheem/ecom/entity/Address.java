package com.faheem.ecom.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String addressLine1;
	private String addressLine2;
	private String street;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String phone;
	
	@CreationTimestamp
	@Column(name="created_At" ,updatable=false)
	private LocalDateTime createdAt;

	@UpdateTimestamp
	@Column(name="update_At",insertable=false)
	private LocalDateTime updatedAt;
	
}
