package br.com.partituras.partituras.mapper;

import br.com.partituras.partituras.controller.response.ListarPartituraResponse;
import br.com.partituras.partituras.domain.Partitura;

public class ListarPartituraMapper {

    public static ListarPartituraResponse toResponse(Partitura entity) {

        ListarPartituraResponse response = new ListarPartituraResponse();

        response.setId(entity.getId());
        response.setTitulo(entity.getTitulo());
        response.setAutor(entity.getAutor());
        response.setAvaliacao(entity.getAvaliacao());

        return response;
    }
}
