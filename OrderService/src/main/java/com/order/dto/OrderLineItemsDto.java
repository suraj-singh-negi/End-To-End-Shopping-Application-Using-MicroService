package com.order.dto;

import java.math.BigDecimal;

import com.order.model.OrderLineItems;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsDto {

	private Long id;
	private String skuCode;
	private BigDecimal price;
	private Integer quantity;
	
}
