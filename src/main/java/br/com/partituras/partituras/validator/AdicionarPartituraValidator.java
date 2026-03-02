package br.com.partituras.partituras.validator;

import br.com.partituras.partituras.controller.request.AdicionarPartituraRequest;
import br.com.partituras.partituras.repository.ParituraRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class AdicionarPartituraValidator {

    @Autowired
    private ParituraRepository parituraRepository;


    public void validar(@Valid AdicionarPartituraRequest request) {

        if (parituraRepository.existsByTitulo(request.getTitulo()) && parituraRepository.existsByAutor(request.getAutor())) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "já existe uma partitura com esse nome e esse autor");
        }
    }
}
