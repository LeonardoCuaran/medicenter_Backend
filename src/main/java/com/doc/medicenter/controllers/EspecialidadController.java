package com.doc.medicenter.controllers;

import com.doc.medicenter.enums.Especialidad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {

    @GetMapping
    public Especialidad[] getSpecialities() {
        return Especialidad.values();
    }
}
