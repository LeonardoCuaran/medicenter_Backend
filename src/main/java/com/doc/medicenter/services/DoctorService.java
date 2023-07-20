package com.doc.mediplus.services;

import com.doc.mediplus.models.Doctor;
import com.doc.mediplus.repositories.DoctorRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor save(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Iterable<Doctor> findAll() {
        return doctorRepository.findAll();
    }
}
