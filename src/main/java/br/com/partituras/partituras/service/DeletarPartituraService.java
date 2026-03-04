package br.com.partituras.partituras.service;

import br.com.partituras.partituras.repository.ParituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DeletarPartituraService {

    @Autowired
    private ParituraRepository parituraRepository;

    public void deletar(Long id) {

        if (!parituraRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "partitura não encontrada");
        }

        parituraRepository.deleteById(id);
    }
}
