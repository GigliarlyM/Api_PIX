package br.com.tranquilo.pix.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class ContaService {

    @Autowired
    private ContaRepository repository;

    public Conta adicionarNovaConta(Conta novaConta){
        Conta contaCriada = null;
        if (!novaConta.getTitular().equalsIgnoreCase("Penilson")){
            contaCriada = novaConta;
            repository.save(novaConta);
        }

        return contaCriada;
    }
    
    public List<Conta> listarContas() {
        return repository.findAll();
    }
}
