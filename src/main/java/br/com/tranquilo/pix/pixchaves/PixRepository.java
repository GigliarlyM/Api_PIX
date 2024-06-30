package br.com.tranquilo.pix.pixchaves;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PixRepository extends JpaRepository<Pix, String> {
}
