package br.com.tranquilo.pix.conta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
    List<Conta> findByTitular(String titular);
}
