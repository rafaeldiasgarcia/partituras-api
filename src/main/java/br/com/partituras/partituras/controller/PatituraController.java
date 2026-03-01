package br.com.partituras.partituras.controller;

import br.com.partituras.partituras.controller.response.DetalharPartituraResponse;
import br.com.partituras.partituras.controller.response.ListarPartituraResponse;
import br.com.partituras.partituras.service.DetalharPartituraService;
import br.com.partituras.partituras.service.ListarPartituraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partituras")
public class PatituraController {

    @Autowired
    private ListarPartituraService listarPartituraService;

    @Autowired
    private DetalharPartituraService detalharPartituraService;

    @GetMapping
    public List<ListarPartituraResponse> lista() {

        return listarPartituraService.listar();
    }

    @GetMapping("/{id}")
    public DetalharPartituraResponse detalhar(@PathVariable Long id) {

        return detalharPartituraService.detalhar(id);
    }
}
