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
@Table(name="mensagemJustificativa")
public class MensagemJustificativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensagemJustificativa;
    private String assunto, corpo;
    private DateTimeFormat enviadoEm;
    @JoinColumn(name= "idAdministrador")
    private Administrador administrador;
    @JoinColumn(name= "idInstituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "idDenuncia")
    private Denuncia denuncia;
    @JoinColumn(name= "idReportAvaliacao")
    private ReportAvaliacao reportAvaliacao;
}
