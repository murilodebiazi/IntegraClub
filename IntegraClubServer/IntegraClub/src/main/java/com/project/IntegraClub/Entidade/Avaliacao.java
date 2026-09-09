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
@Table(name="avaliacao")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAvaliacao;
    private int nota;
    private String comentario;
    private DateTimeFormat criadoEm;
    @JoinColumn(name= "idUsuario")
    private Usuario usuario;
    @JoinColumn(name= "idInstituicao")
    private Instituicao instituicao;
}
