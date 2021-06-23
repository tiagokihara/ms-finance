package br.com.tiagokihara.fnconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class FnConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnConfigServerApplication.class, args);
	}
}
