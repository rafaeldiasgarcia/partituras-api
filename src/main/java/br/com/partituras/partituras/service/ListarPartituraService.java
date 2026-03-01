package br.com.partituras.partituras.service;

import br.com.partituras.partituras.controller.response.ListarPartituraResponse;
import br.com.partituras.partituras.mapper.ListarPartituraMapper;
import br.com.partituras.partituras.repository.ParituraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.*;

@Service
public class ListarPartituraService {

    @Autowired
    private ParituraRepository parituraRepository;

    public List<ListarPartituraResponse> listar() {
        return parituraRepository.findAll().stream()
                .map(ListarPartituraMapper::toResponse)
                .collect(toList());
    }
}
