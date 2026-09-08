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
@Table(name="report_avaliacao")
    public class Report_avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_report_avaliacao, nota;
    private String comentario;
    private DateTimeFormat criado_em;
    @JoinColumn(name= "id_avaliacao")
    private Avaliacao avaliacao;
    @JoinColumn(name= "id_usuario")
    private Usuario usuario;
}
