package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="denuncia")
public class Denuncia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDenuncia;
    private String motivo, status, resposta;
    private DateTimeFormat criadoEm, avaliadoEm;
    @JoinColumn(name= "idUsuario")
    private Usuario usuario;
    @JoinColumn(name= "idInstituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "idAdministrador")
    private Administrador administrador;
}
