package org.ptech.citas.java.entities;
import java.time.LocalDateTime;

import org.ptech.citas.java.entities.enums.EstadoCita;

public class Cita {

    int id;
    LocalDateTime fechaCita;  
    Consulta consultorio;
    EstadoCita estadoCita;
    Paciente paciente;
    
    
    //CONTRUCTORES
    public Cita(int id, LocalDateTime fechaCita, Consulta consultorio, EstadoCita estadoCita), Paciente paciente {
        this.id = id;
        this.fechaCita = fechaCita;
        this.consultorio = consultorio;
        this.estadoCita = estadoCita;
        this.paciente =paciente;
    }
    //setter y getter



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public LocalDateTime getFechaCita() {
        return fechaCita;
    }



    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }



    public Consulta getConsultorio() {
        return consultorio;
    }



    public void setConsultorio(Consulta consultorio) {
        this.consultorio = consultorio;
    }



    public EstadoCita getEstadoCita() {
        return estadoCita;
    }



    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
