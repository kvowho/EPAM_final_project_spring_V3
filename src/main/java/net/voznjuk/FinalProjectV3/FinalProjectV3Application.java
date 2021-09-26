package net.voznjuk.FinalProjectV3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FinalProjectV3Application {

	public static void main(String[] args) {

		SpringApplication.run(FinalProjectV3Application.class, args);
	}

	@Bean
	public RestTemplate RestTemplate(){
		return new RestTemplateBuilder().build();
	}

}
