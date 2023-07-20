package com.doc.medicenter.models;

import com.doc.medicenter.enums.Especialidad;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
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
@Table("citamedica")
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Citamedica{

    @Id
    private Long id;

    @NotNull
    private Long pacienteIdentificacion;

    @NotNull
    private Especialidad especialidad;

    @NotNull
    private Long doctorId;

    @NotNull
    private Long pacienteId;
}
