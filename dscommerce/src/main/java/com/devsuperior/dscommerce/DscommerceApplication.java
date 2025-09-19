package com.devsuperior.dscommerce;

import com.devsuperior.entities.Employee;
import com.devsuperior.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DscommerceApplication implements CommandLineRunner {

    @Autowired
    private SalaryService salaryService;

    public static void main(String[] args) {

        SpringApplication.run(DscommerceApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee(4000.0, "Maria");
        System.out.println(salaryService.netSalary(employee));
    }
}
