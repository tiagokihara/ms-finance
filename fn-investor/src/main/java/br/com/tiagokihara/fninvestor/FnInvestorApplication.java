package br.com.tiagokihara.fninvestor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FnInvestorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnInvestorApplication.class, args);
	}

}
