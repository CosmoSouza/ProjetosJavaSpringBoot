package io.github.cosmosouza.pedido;
import io.github.cosmosouza.pedido.entites.Order;
import io.github.cosmosouza.pedido.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cosmosouza.pedido.services.OrderService;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class SistemaPedidoApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ShippingService shippingService;
    public static void main(String[] args) {
        SpringApplication.run(SistemaPedidoApplication.class, args);
    }
     @Override
            public void run(String... args) throws Exception {


            Locale.setDefault(Locale.US); 
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Digite o codigo do Pedido: ");
                Integer code = (sc.nextInt());
                System.out.println("Digite o valor pedido:");
                double basic = (sc.nextDouble());
                System.out.println("Digite o valor desconto:");
                double discount = sc.nextDouble();

                Order order = new Order(basic, code, discount);
                double total = orderService.total(order);

                System.out.printf("Pedido código %d%n ", order.getCode());
                System.out.printf("Valor total: R$ %.2f%n", total);
            }
        }
    }



