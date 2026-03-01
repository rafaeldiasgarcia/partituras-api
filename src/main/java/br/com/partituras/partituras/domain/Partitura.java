package br.com.partituras.partituras.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@Entity
public class Partitura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String arranjador;
    private Integer bpm;
    private Integer avaliacao;
    private LocalDateTime data_criacao;

    @Enumerated(EnumType.STRING)
    private Tonalidade tonalidade;


}
