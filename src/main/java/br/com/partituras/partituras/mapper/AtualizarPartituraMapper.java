package br.com.partituras.partituras.mapper;

import br.com.partituras.partituras.controller.request.AtualizarPartituraRequest;
import br.com.partituras.partituras.domain.Partitura;

public class AtualizarPartituraMapper {

    public static Partitura toEntity(Partitura partitura, AtualizarPartituraRequest request) {

        partitura.setTitulo(request.getTitulo());
        partitura.setAutor(request.getAutor());
        partitura.setArranjador(request.getArranjador());
        partitura.setBpm(request.getBpm());
        partitura.setAvaliacao(request.getAvaliacao());
        partitura.setTonalidade(request.getTonalidade());

        return partitura;
    }
}
