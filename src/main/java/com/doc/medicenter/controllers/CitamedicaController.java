package com.doc.medicenter.controllers;

import com.doc.medicenter.models.Citamedica;
import com.doc.medicenter.services.CitamedicaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citamedica")
public class CitamedicaController {

    private final CitamedicaService citamedicaService;

    public CitamedicaController(CitamedicaService citamedicaService) {
        this.citamedicaService = citamedicaService;
    }

    @PostMapping
    public Citamedica createCitamedica(@RequestBody @Valid Citamedica citamedica) {
        return citamedicaService.save(citamedica);
    }

    @GetMapping
    public Iterable<Citamedica> getAllCitamedica() {
        return citamedicaService.findAll();
    }
}
