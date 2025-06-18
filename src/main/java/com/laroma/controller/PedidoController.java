package com.laroma.controller;

import com.laroma.model.Pedido;
import com.laroma.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return service.criar(pedido);
    }

    @GetMapping
    public List<Pedido> listar() {
        return service.listar();
    }

    @PutMapping("/confirmar/{id}")
    public Pedido confirmar(@PathVariable Long id) {
        return service.confirmarPagamento(id);
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }
}

