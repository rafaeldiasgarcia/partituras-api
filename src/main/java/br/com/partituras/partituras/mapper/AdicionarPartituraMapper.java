package br.com.partituras.partituras.mapper;

import br.com.partituras.partituras.controller.request.AdicionarPartituraRequest;
import br.com.partituras.partituras.domain.Partitura;

import java.time.LocalDate;

public class AdicionarPartituraMapper {

    public static Partitura toEntity(AdicionarPartituraRequest request) {

        Partitura partitura = new Partitura();

        partitura.setTitulo(request.getTitulo());
        partitura.setAutor(request.getAutor());
        partitura.setArranjador(request.getArranjador());
        partitura.setBpm(request.getBpm());
        partitura.setAvaliacao(request.getAvaliacao());
        partitura.setTonalidade(request.getTonalidade());
        partitura.setDataCriacao(LocalDate.now());

        return partitura;
    }
}
