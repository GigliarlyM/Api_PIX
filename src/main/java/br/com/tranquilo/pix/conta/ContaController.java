package br.com.tranquilo.pix.conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/conta")
public class ContaController {

    @Autowired
    private ContaService service;

    @GetMapping("")
    public ResponseEntity<List<Conta>> listarContas() {
        List<Conta> contas = service.listarContas();

        return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Conta> adicionarConta(@RequestBody Conta conta) {
        Conta contaCriada = service.adicionarNovaConta(conta);

        return new ResponseEntity<Conta>(contaCriada, HttpStatus.OK);
    }
}
