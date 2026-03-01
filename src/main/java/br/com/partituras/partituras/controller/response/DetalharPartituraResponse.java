package br.com.partituras.partituras.controller.response;

import br.com.partituras.partituras.domain.Tonalidade;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class DetalharPartituraResponse {

    private Long id;
    private String titulo;
    private String autor;
    private String arranjador;
    private Integer bpm;
    private Integer avaliacao;
    private LocalDate dataCriacao;
    private Tonalidade tonalidade;
}
