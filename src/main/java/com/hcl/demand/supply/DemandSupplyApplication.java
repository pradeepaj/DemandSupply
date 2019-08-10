package com.hcl.demand.supply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {" com.hcl.demand.supply"})
@EnableJpaRepositories
public class DemandSupplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemandSupplyApplication.class, args);
	}

}
