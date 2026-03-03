package br.com.partituras.partituras.validator;

import br.com.partituras.partituras.controller.request.AtualizarPartituraRequest;
import br.com.partituras.partituras.repository.ParituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class AtualizarPartituraValidator {

    @Autowired
    private ParituraRepository parituraRepository;

    public void validar(Long id, AtualizarPartituraRequest request) {

        if (!parituraRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "partitura não encontrada");
        }

        if (request.getTitulo() != null && request.getAutor() != null
                && parituraRepository.existsByTituloAndAutorAndIdNot(request.getTitulo(), request.getAutor(), id)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "já existe uma partitura com esse nome e esse autor");
        }
    }
}

