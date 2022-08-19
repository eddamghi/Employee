package com.example.Gestion;

import com.example.Gestion.Employee.Employee;
import org.hibernate.annotations.LazyToOne;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class GestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionApplication.class, args);
	}
	@GetMapping
	public List<Employee> getEmployees(){
		return List.of(new Employee(
				1L,
				"Zineb",
				LocalDate.of(2001, Month.SEPTEMBER, 13),
				"zinebeddamghi@gmail.com"
		));
	}
}
