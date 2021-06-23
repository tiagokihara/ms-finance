package br.com.tiagokihara.fnpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.tiagokihara.fnpayroll.entities.Payment;
import br.com.tiagokihara.fnpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{investorId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long investorId, @PathVariable Integer days) {
		return ResponseEntity.ok(paymentService.getPayment(investorId, days));
	}

	public ResponseEntity<Payment> getPaymentAlternative(Long investorId, Integer days) {
		return ResponseEntity.ok(new Payment("Mockado", 11.0, 10));
	}
}
