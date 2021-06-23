package br.com.tiagokihara.fnpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiagokihara.fnpayroll.entities.Investor;
import br.com.tiagokihara.fnpayroll.entities.Payment;
import br.com.tiagokihara.fnpayroll.feignClients.InvestorFeignClient;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private InvestorFeignClient investorFeignClient;

	public Payment getPayment(Long investorId, Integer days) {
		Investor investor = investorFeignClient.findById(investorId).getBody();

		return new Payment(investor.getName(), investor.getDailyIncome(), 10);
	}

}
