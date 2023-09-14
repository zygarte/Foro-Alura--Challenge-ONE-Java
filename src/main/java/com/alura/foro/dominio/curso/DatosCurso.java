package com.alura.foro.dominio.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso(
        @NotBlank String nombre,
        @NotBlank String categoria) {
}
