package br.com.partituras.partituras.repository;

import br.com.partituras.partituras.domain.Partitura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParituraRepository extends JpaRepository<Partitura, Long> {

    boolean existsByTitulo(String titulo);
    boolean existsByAutor(String autor);
}
