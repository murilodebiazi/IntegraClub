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
    private int id_denuncia;
    private String motivo, status, resposta;
    private DateTimeFormat criado_em, avaliado_em;
    @JoinColumn(name= "id_usuario")
    private Usuario usuario;
    @JoinColumn(name= "id_instituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "id_administrador")
    private Administrador administrador;
}
