package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="instituicaoFoto")
public class InstituicaoFoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstituicaoFoto;
    private String url;
    @JoinColumn(name= "idInstituicao")
    private Instituicao instituicao;
}
