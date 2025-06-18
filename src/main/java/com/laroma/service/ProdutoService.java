package com.laroma.service;

import com.laroma.model.Produto;
import com.laroma.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }

    public List<Produto> listarTodos() {
        return repo.findAll();
    }

    public List<Produto> buscarPorMarca(String marca) {
        return repo.findByMarcaContainingIgnoreCase(marca);
    }

    public Produto salvar(Produto produto) {
        return repo.save(produto);
    }

    public Produto buscarPorId(Long id) {
        return repo.findById(id).orElse(null);
    }
}

