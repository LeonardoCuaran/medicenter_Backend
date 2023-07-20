package com.doc.medicenter.repositories;

import com.doc.medicenter.models.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {
}
