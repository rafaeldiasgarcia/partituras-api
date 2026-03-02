package br.com.partituras.partituras.service;

import br.com.partituras.partituras.controller.request.AdicionarPartituraRequest;
import br.com.partituras.partituras.domain.Partitura;
import br.com.partituras.partituras.mapper.AdicionarPartituraMapper;
import br.com.partituras.partituras.repository.ParituraRepository;
import br.com.partituras.partituras.validator.AdicionarPartituraValidator;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdcionarPartituraService {

    @Autowired
    private AdicionarPartituraValidator validator;

    @Autowired
    private ParituraRepository parituraRepository;

    public void adicionar(@Valid AdicionarPartituraRequest request) {

        validator.validar(request);

        Partitura partitura = AdicionarPartituraMapper.toEntity(request);
        parituraRepository.save(partitura);
    }
}
