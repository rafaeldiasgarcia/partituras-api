package br.com.partituras.partituras.mapper;

import br.com.partituras.partituras.controller.response.DetalharPartituraResponse;
import br.com.partituras.partituras.domain.Partitura;

public class DetalharPartituraMapper {
    public static DetalharPartituraResponse toResponse(Partitura entity) {

        DetalharPartituraResponse response = new DetalharPartituraResponse();

        response.setId(entity.getId());
        response.setTitulo(entity.getTitulo());
        response.setAutor(entity.getAutor());
        response.setArranjador(entity.getArranjador());
        response.setBpm(entity.getBpm());
        response.setAvaliacao(entity.getAvaliacao());
        response.setTonalidade(entity.getTonalidade());
        response.setDataCriacao(entity.getDataCriacao());

        return response;
    }
}
