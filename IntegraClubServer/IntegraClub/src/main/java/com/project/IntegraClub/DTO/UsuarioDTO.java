package com.project.IntegraClub.DTO;

import jakarta.validation.constraints.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

public record UsuarioDTO (
    @Id int id_usuario,
    @NotNull @Size(max = 150) String nome,
    @NotNull @Email String email,
    @NotNull String senha,
    String telefone,
    DateTimeFormat criado_em
){}
