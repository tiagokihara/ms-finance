package br.com.tiagokihara.fnuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FnUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnUserApplication.class, args);
	}
}
