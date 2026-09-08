package com.project.IntegraClub.DTO;

import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

public record InstituicaoDTO (
        @Id int id_instituicao,
        @NotNull @Size(min = 18, max = 18)String cnpj,
        @NotNull @Email String email,
        @NotNull @Size (min = 5)String senha,
        @NotNull @Size (max = 150) String nome,
        @NotNull String descricao,
        @NotNull @Size (min = 12 , max = 15)String telefone,
        @NotNull String site,
        @NotNull String logo,
        @NotNull String logradouro,
        @NotNull String numero,
        @NotNull String bairro,
        @NotNull String cidade,
        @NotNull String estado,
        @NotNull String cep,
        @NotNull Long latitude,
        @NotNull Long longitude,
        @NotNull boolean verificada,
        @NotNull boolean ativa,
        DateTimeFormat criado_em
){}
