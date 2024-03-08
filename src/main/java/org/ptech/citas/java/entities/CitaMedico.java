package org.ptech.citas.java.entities;

import java.time.LocalDateTime;

import org.ptech.citas.java.entities.enums.EstadoCita;

import interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable {
    Medico medico;
    EstadoCita estadoCita;
    public CitaMedico(int id, LocalDateTime fechaCita, Consulta consultorio, EstadoCita estadoCita) {
        super(id, fechaCita, consultorio, estadoCita);
        this.estadoCita = EstadoCita.AGENDADA;

    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consulta c) {
       this.setFechaCita(fecha);
       this.setConsultorio(c);
       return true;
    }
    @Override
    public boolean reagendarCita(LocalDateTime nuevaFecha, Consulta nuevoc) {
       
        this.setFechaCita(nuevaFecha);
        this.setConsultorio(nuevoc);
        return true;
    }
    @Override
    public boolean cancelarCita(LocalDateTime cancelarFecha, Consulta noc) {
        this.estadoCita = EstadoCita.CANCELADA;
        return true;
    }

  
}
