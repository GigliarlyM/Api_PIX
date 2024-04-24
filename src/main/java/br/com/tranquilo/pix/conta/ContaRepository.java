package br.com.tranquilo.pix.conta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
//    List<Conta> findByTitular(String titular);
}
