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
@Table(name="mensagem_justificativa")
public class Mensagem_justificativa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mensagem_justificativa;
    private String assunto, corpo;
    private DateTimeFormat enviado_em;
    @JoinColumn(name= "id_administrador")
    private Administrador administrador;
    @JoinColumn(name= "id_instituicao")
    private Instituicao instituicao;
    @JoinColumn(name= "id_denuncia")
    private Denuncia denuncia;
    @JoinColumn(name= "id_report_avaliacao")
    private Report_avaliacao report_avaliacao;
}
