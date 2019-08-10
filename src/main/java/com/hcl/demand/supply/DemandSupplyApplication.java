package com.hcl.demand.supply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {" com.hcl.demand.supply"})
public class DemandSupplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemandSupplyApplication.class, args);
	}

}
