package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="instituicao_foto")
public class Instituicao_foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_instituicao_foto;
    private String url;
    @JoinColumn(name= "id_instituicao")
    private Instituicao instituicao;
}
