package com.project.JosePedroVissoti_Pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.project")
@EntityScan(basePackages = {"com.project.domains", "com.project.domains.enums"})
@EnableJpaRepositories(basePackages = {"com.project.repositories"})
@SpringBootApplication
public class JosePedroVissotiPokemonApplication {

    public static void main(String[] args) {
        SpringApplication.run(JosePedroVissotiPokemonApplication.class, args);
    }

}
