package com.laroma.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private String descricao;
    private String imagemUrl;

    private Double precoAtual;
    private Double precoOriginal;
    private Boolean destaque; // se aparece na home
}

