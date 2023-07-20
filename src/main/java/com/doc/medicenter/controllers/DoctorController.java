package com.doc.medicenter.controllers;

import com.doc.medicenter.models.Doctor;
import com.doc.medicenter.services.DoctorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody @Valid Doctor doctor) {
        return doctorService.save(doctor);
    }

    @GetMapping
    public Iterable<Doctor> getAllDoctors() {
        return doctorService.findAll();
    }
}
