package com.testapp.customservice;

import com.testapp.customservice.config.CustomerConfigParams;
import com.testapp.customservice.entities.Customer;
import com.testapp.customservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(CustomerConfigParams.class)
public class CustomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder()
					.name("Hiba").email("hib@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Gaia").email("gaia@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Soukaina").email("souk@gmail.com")
					.build());
			customerRepository.findAll().forEach(c->{
				System.out.println("==================");
				System.out.println(c.getId());
				System.out.println(c.getName());
				System.out.println(c.getEmail());
				System.out.println("==================");

			});
		};
	}
}
