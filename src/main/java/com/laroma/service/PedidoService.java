package com.laroma.service;

import com.laroma.model.Pedido;
import com.laroma.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Pedido criar(Pedido pedido) {
        pedido.setStatus("PENDENTE");
        return repository.save(pedido);
    }

    public List<Pedido> listar() {
        return repository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Pedido confirmarPagamento(Long id) {
        Pedido pedido = repository.findById(id).orElseThrow();
        pedido.setStatus("PAGO");
        return repository.save(pedido);
    }
}

