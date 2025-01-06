package com.example.b01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing	//base entity의 listener 활성화
public class B01Application {

	public static void main(String[] args) {
		SpringApplication.run(B01Application.class, args);
	}

}
