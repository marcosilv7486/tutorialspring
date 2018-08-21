package com.marcosilv7.proyectodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan({"com.marcosilv7.proyectodemo.seguridad.repository.domain"})
@EnableJpaRepositories(basePackages = {"com.marcosilv7.proyectodemo.seguridad.repository.interfaces"})
public class ProyectodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectodemoApplication.class, args);
	}
}
