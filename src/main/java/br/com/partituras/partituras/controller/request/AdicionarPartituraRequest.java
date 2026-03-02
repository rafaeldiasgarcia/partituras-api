package br.com.partituras.partituras.controller.request;

import br.com.partituras.partituras.domain.Tonalidade;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AdicionarPartituraRequest {

    @NotNull(message = "título é obrigatório")
    private String titulo;

    @NotNull(message = "autor é obrigatório")
    private String autor;

    private String arranjador;
    private Integer bpm;
    private Integer avaliacao;
    private Tonalidade tonalidade;
}
