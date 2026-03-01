package br.com.partituras.partituras.service;

import br.com.partituras.partituras.controller.response.DetalharPartituraResponse;
import br.com.partituras.partituras.domain.Partitura;
import br.com.partituras.partituras.mapper.DetalharPartituraMapper;
import br.com.partituras.partituras.repository.ParituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DetalharPartituraService {

    @Autowired
    private ParituraRepository parituraRepository;


    public DetalharPartituraResponse detalhar(Long id) {
        Partitura partitura = parituraRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Partitura não encontrada"));

        return DetalharPartituraMapper.toResponse(partitura);
    }
}
