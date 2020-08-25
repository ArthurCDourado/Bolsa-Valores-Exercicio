package com.example.repository;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.entidades.Fechamento;

@Repository
public interface FechamentoRepository extends JpaRepository<Fechamento, Long> {

	@Query("select sum(quantidade) as quantidade from user_trade where data <= :data")
	int calcularQuantidade(LocalDate data);
	
	@Query("select price from instrument_quote where date = :data")
	double calcularPrecoAtivo(LocalDate data);
	
	@Query("select sum(valor_total) as valor_total from user_trade where data <= :data")
	double calcularRendimentoTotal(LocalDate data);
}
