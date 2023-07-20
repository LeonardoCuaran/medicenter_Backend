package com.doc.medicenter.repositories;

import com.doc.medicenter.models.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
}
