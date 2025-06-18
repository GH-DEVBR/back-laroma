package com.laroma.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProdutoDTO {
    private String nome;
    private String marca;
    private String descricao;
    private String imagemUrl;
    private Double precoAtual;
    private Double precoOriginal;
    private Boolean destaque;
}

