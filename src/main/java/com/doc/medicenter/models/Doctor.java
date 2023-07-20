package com.doc.medicenter.models;

import com.doc.medicener.enums.Especialidad;
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
@Table("doctor")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Doctor {

    @Id
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;

    @NotNull
    private Especialidad especialidad;

    @NotBlank
    private String medicalCenter;

    @NotBlank
    private String email;
}
