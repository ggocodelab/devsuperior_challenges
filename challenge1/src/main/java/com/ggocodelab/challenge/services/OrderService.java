package com.ggocodelab.challenge.services;

import org.springframework.stereotype.Service;

import com.ggocodelab.challenge.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public double total(Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscount()/100) 
				+ shippingService.shipment(order);
	}
}
