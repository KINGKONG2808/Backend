package com.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.beans.Employee;

@SpringBootApplication /** diem vao cua spring boot */
public class StartServer implements CommandLineRunner {
	@Autowired
	Employee employee;
	
	@Value("${server.port}") private Integer port;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("---------------- E M P L O Y E E ----------------");
//		System.out.println("Name: " + employee.name);
//		System.out.println("Address: " + employee.address.address1 + " " + employee.address.address2);
		
		System.out.println("---------------- "+port+" -----------------");
	}

	public static void main(String[] args) {
		SpringApplication.run(StartServer.class, args);
	}
}