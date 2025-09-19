package io.github.cosmosouza.pedido.services;


import io.github.cosmosouza.pedido.entites.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double valordoDesconto = order.getBasic() * ( 1 - order.getDiscount() / 100);
        double frete = shippingService.shipment(order);
        return valordoDesconto + frete;
    }
}


