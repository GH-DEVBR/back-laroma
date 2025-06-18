package com.laroma.controller;

import com.laroma.model.Produto;
import com.laroma.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listarTodos();
    }

    @GetMapping("/marca")
    public List<Produto> porMarca(@RequestParam String nome) {
        return service.buscarPorMarca(nome);
    }

    @GetMapping("/{id}")
    public Produto porId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }
}
