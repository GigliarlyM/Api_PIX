package br.com.tranquilo.pix.conta;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Conta {

    @Id
    @GeneratedValue
    private int numeroConta;
    public String nomeBanco;

    @Column(length = 50)
    public String titular;
    private double saldo;

}
