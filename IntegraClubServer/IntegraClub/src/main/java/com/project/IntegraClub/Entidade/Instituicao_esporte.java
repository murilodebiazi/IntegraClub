package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="instituicao_esporte")
public class Instituicao_esporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_instituicao_esporte;
    @JoinColumn(name= "id_instituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "id_esporte")
    private Esporte esporte;
}
