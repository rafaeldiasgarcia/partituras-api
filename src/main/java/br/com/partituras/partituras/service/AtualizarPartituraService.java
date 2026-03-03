package br.com.partituras.partituras.service;

import br.com.partituras.partituras.controller.request.AtualizarPartituraRequest;
import br.com.partituras.partituras.domain.Partitura;
import br.com.partituras.partituras.mapper.AtualizarPartituraMapper;
import br.com.partituras.partituras.repository.ParituraRepository;
import br.com.partituras.partituras.validator.AtualizarPartituraValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import static br.com.partituras.partituras.mapper.AtualizarPartituraMapper.*;

@Service
public class AtualizarPartituraService {

    @Autowired
    private AtualizarPartituraValidator validator;

    @Autowired
    private ParituraRepository parituraRepository;

    public void atualizar(Long id, AtualizarPartituraRequest request) {

        validator.validar(id, request);

        Partitura partitura = parituraRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "partitura não encontrada"));
        toEntity(partitura, request);
        parituraRepository.save(partitura);
    }
}



