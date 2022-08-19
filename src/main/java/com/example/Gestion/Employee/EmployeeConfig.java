package com.example.Gestion.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository){
        return args -> {
            Employee zineb = new Employee(
                    1L,
                    "Zineb",
                    LocalDate.of(2001, Month.SEPTEMBER,13),
                    "eddamghizineb520@gmail.com"
            );
            Employee alex = new Employee(
                    "Alex",
                    LocalDate.of(2003, Month.SEPTEMBER,1),
                    "alex330@gmail.com"
            );
            repository.saveAll(
                    List.of(zineb, alex)
            );
        };
    }
}
