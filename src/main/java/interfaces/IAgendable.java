package interfaces;

import java.time.LocalDateTime;

import org.ptech.citas.java.entities.Consulta;

public interface IAgendable {
    //proponer un metodo para agendar cita
    public boolean agendarCita(LocalDateTime fecha , Consulta c);
    //proponer un metodo para reagendar cita
    public boolean reagendarCita(LocalDateTime nuevaFecha , Consulta nuevoc);
    //
    public boolean cancelarCita(LocalDateTime cancelarFecha, Consulta noc);
}
