package com.faheem.ecom.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="order")
public class Order {

	private Long orderId;
	private String orderTrackingNum;
	private String totalQuantity;
	private String totalPrice;
	private String orderStatus;
	private String razorPayPaymentId;
	@CreationTimestamp
	@Column(name = "created_At", updatable = false)
	private LocalDateTime createdAt;

	@UpdateTimestamp
	@Column(name = "update_At", insertable = false)
	private LocalDateTime updatedAt;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;
}
