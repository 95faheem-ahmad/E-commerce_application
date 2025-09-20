package com.faheem.ecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "order_Item")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String OrderItemId;
	@Column(name="image_url")
	private String imageUrl;
	@Column(name="unit_price")
	private String unitPrice;
	private String quantity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

}
