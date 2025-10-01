package com.ggocodelab.challenge.services;

import org.springframework.stereotype.Service;

import com.ggocodelab.challenge.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if(order.getBasic() >= 200.00) {
			return 0.0;
		}
		
		if(order.getBasic() >= 100.0 && order.getBasic() < 200.0) {
			return 12.00;
		}
		
		if(order.getBasic() < 100.0) {
			return 20.0;
		}
		return shipment(order);
	}

}
