package br.com.partituras.partituras.controller;

import br.com.partituras.partituras.controller.request.AdicionarPartituraRequest;
import br.com.partituras.partituras.controller.response.DetalharPartituraResponse;
import br.com.partituras.partituras.controller.response.ListarPartituraResponse;
import br.com.partituras.partituras.service.AdcionarPartituraService;
import br.com.partituras.partituras.service.DetalharPartituraService;
import br.com.partituras.partituras.service.ListarPartituraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partituras")
public class PatituraController {

    @Autowired
    private ListarPartituraService listarPartituraService;

    @Autowired
    private DetalharPartituraService detalharPartituraService;

    @Autowired
    private AdcionarPartituraService adcionarPartituraService;

    @GetMapping
    public List<ListarPartituraResponse> lista() {

        return listarPartituraService.listar();
    }

    @GetMapping("/{id}")
    public DetalharPartituraResponse detalhar(@PathVariable Long id) {

        return detalharPartituraService.detalhar(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@Valid @RequestBody AdicionarPartituraRequest request) {

        adcionarPartituraService.adicionar(request);
    }
}
