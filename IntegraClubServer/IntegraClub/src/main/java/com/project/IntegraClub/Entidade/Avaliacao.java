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
    private int id_avaliacao;
    private int nota;
    private String comentario;
    private DateTimeFormat criado_em;
    @JoinColumn(name= "id_usuario")
    private Usuario usuario;
    @JoinColumn(name= "id_instituicao")
    private Instituicao instituicao;
}
