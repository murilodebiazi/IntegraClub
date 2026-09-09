package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PedidoVerificacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedidoVerificacao;
    private String status;
    private DateTimeFormat criadoEm, avaliadoEm;
    @JoinColumn(name= "idInstituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "idAdministrador")
    private Administrador administrador;
}
