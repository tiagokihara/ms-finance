package br.com.tiagokihara.fnpayroll.services;

import br.com.tiagokihara.fnpayroll.entities.Payment;

public interface PaymentService {

	Payment getPayment(Long investorId, Integer days);
}
