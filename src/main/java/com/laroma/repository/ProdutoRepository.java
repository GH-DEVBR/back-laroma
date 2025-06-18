package com.laroma.repository;

import com.laroma.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByMarcaContainingIgnoreCase(String marca);
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}

