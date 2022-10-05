package com.ticenvios.ticenvios.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.ticenvios.ticenvios.backend.entities")
public class TicenviosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicenviosApplication.class, args);
	}

}
