package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="instituicaoEsporte")
public class InstituicaoEsporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstituicaoEsporte;
    @JoinColumn(name= "idInstituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "idEsporte")
    private Esporte esporte;
}
