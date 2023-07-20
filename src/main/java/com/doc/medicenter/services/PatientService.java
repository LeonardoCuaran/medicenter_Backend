package com.doc.mediplus.services;

import com.doc.mediplus.models.Patient;
import com.doc.mediplus.repositories.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public Iterable<Patient> findAll() {
        return patientRepository.findAll();
    }
}
