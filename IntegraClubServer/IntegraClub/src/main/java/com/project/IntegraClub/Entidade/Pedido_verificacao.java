package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pedido_verificacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pedido_verificacao;
    private String status;
    private DateTimeFormat criado_em, avaliado_em;
    @JoinColumn(name= "id_instituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "id_admnistrador")
    private Administrador administrador;
}
