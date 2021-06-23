package br.com.tiagokihara.fninvestor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiagokihara.fninvestor.entities.Investor;

public interface InvestorRepository extends JpaRepository<Investor, Long>{

}
