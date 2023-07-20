package com.doc.medicenter.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("paciente")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Paciente {

    @Id
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotNull
    private Long identificacion;

    @NotNull
    private Integer edad;

    @NotBlank
    private String telefono;
}
