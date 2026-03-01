package br.com.partituras.partituras.controller;

import br.com.partituras.partituras.controller.response.ListarPartituraResponse;
import br.com.partituras.partituras.service.ListarPartituraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/partituras")
public class PatituraController {

    @Autowired
    private ListarPartituraService listarPartituraService;

    @GetMapping
    public List<ListarPartituraResponse> lista() {

        return listarPartituraService.listar();
    }
}
