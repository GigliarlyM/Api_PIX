package br.com.tranquilo.pix.pixchaves;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Pix {

    @Id
    @Column (name = "chave")
    String chavePix;
    String nomeTitular;
}
