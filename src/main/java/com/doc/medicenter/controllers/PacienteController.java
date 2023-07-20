package com.doc.medicenter.controllers;

import com.doc.medicenter.models.Paciente;
import com.doc.medicenter.services.PacienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {

    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping
    public Paciente createPaciente(@RequestBody @Valid Paciente paciente) {
        return pacienteService.save(paciente);
    }

    @GetMapping
    public Iterable<Paciente> getAllPaciente() {
        return PacienteService.findAll();
    }
}
