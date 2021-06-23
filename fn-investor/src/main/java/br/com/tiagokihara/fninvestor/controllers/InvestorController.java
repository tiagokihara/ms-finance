package br.com.tiagokihara.fninvestor.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagokihara.fninvestor.entities.Investor;
import br.com.tiagokihara.fninvestor.repositories.InvestorRepository;

@RefreshScope
@RestController
@RequestMapping("/investors")
public class InvestorController {

	private static Logger logger = LoggerFactory.getLogger(InvestorController.class);

	@Autowired
	private Environment env;

	@Autowired
	private InvestorRepository investorRepository;

	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfig() {
		return ResponseEntity.noContent().build();
	}

	@GetMapping
	public ResponseEntity<List<Investor>> findAll() {
		return ResponseEntity.ok(investorRepository.findAll());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Investor> findById(@PathVariable Long id) {

		logger.info("Port: " + env.getProperty("local.server.port"));

		return ResponseEntity.ok(investorRepository.findById(id).get());
	}
}
