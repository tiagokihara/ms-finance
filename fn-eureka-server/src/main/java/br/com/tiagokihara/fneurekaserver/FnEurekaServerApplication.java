package br.com.tiagokihara.fneurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FnEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnEurekaServerApplication.class, args);
	}

}
