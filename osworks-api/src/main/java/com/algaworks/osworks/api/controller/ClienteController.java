package com.algaworks.osworks.api.controller;

import com.algaworks.osworks.domain.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    List<Cliente> clientes;

    @GetMapping("/clientes")
    public List<Cliente> listar() {

        return clientes;
    }

    @PostMapping("/clientes")
    @ResponseBody
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        //clientes.add(cliente);
        return cliente;
    }
}
