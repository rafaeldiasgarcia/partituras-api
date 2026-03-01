package br.com.partituras.partituras.controller.response;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ListarPartituraResponse {

    private Long id;
    private String titulo;
    private String autor;
    private Integer avaliacao;
}
