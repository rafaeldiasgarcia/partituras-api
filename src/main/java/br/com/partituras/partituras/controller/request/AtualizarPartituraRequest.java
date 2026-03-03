package br.com.partituras.partituras.controller.request;

import br.com.partituras.partituras.domain.Tonalidade;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AtualizarPartituraRequest {

    @NotBlank(message = "título é obrigatório")
    private String titulo;

    @NotBlank(message = "autor é obrigatório")
    private String autor;

    private String arranjador;

    @NotNull(message = "bpm é obrigatório")
    private Integer bpm;

    private Integer avaliacao;

    @NotNull(message = "tonalidade é obrigatória")
    private Tonalidade tonalidade;
}

