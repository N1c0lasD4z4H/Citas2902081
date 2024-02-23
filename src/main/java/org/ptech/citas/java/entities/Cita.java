package org.ptech.citas.java.entities;
import java.time.LocalDateTime;

public class Cita {

    int id;
    LocalDateTime fechaCita;
    Medico medico;
    Paciente paciente;
    Consulta consultorio;
    EstadoCita estadoCita;

    //setter y getter
    public LocalDateTime getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    

}
