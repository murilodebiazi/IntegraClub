package com.project.IntegraClub.Entidade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="esporte")
public class Esporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEsporte;
    private String nome;
}
