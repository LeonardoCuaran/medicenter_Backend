package com.doc.mediplus.services;

import com.doc.mediplus.models.Appointment;
import com.doc.mediplus.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Iterable<Appointment> findAll() {
        return appointmentRepository.findAll();
    }
}
