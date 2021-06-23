package br.com.tiagokihara.fnpayroll.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.tiagokihara.fnpayroll.entities.Investor;

@Component
@FeignClient(name = "fn-investor", path = "/investors")
public interface InvestorFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Investor> findById(@PathVariable Long id);

}
