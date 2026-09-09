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
@Table (name="instituicao")
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInstituicao;
    private String cnpj, email, senha, nome, descricao, telefone, site, logo, logradouro, numero, bairro, cidade,
    estado, cep;
    private Long latitude, longitude;
    private boolean verificada, ativa;
    private DateTimeFormat criadoEm;
}
