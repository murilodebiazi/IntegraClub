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
    public class ReportAvaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReportAvaliacao, nota;
    private String comentario;
    private DateTimeFormat criadoEm;
    @JoinColumn(name= "idAvaliacao")
    private Avaliacao avaliacao;
    @JoinColumn(name= "idUsuario")
    private Usuario usuario;
}
