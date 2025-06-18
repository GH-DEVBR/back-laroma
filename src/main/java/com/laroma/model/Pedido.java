package com.laroma.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;
    private String emailCliente;
    private String enderecoEntrega;

    private Long produtoId;
    private String produtoNome;
    private Double valor;

    private String status; // "PENDENTE", "PAGO", "CANCELADO"

    private String observacao; // opcional, para código Pix, por ex.
}

