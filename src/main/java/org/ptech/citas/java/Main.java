package org.ptech.citas.java;
import java.time.LocalDateTime;
import java.time.LocalDate;

import org.ptech.citas.java.entities.Cita;
import org.ptech.citas.java.entities.Consulta;
import org.ptech.citas.java.entities.Especialidad;
import org.ptech.citas.java.entities.EstadoCita;
import org.ptech.citas.java.entities.Medico;
import org.ptech.citas.java.entities.Paciente;
import org.ptech.citas.java.entities.TipoDocumento;
import org.ptech.citas.java.entities.TipoSangre;


public class Main {
    public static void main(String[] args) {
        //crear objeto medico o instanciar
        //Una manera de dar valor a atributos privados en una clase es atravez del constructor parametrizado
       
       Medico m = new Medico(1,
                "Nicolas",
                "Daza",
                TipoDocumento.CC,
                1021393488L,
                1234L,
                Especialidad.CARDIOLOGO);

        //Iinstanciar otro medico
        Medico m2 = new Medico();
        //Se debe utilizar primero el setter del atributo asignado
        m2.setNombres("Carla");
        m2.setApellidos("Fernandez");
        m2.setNumeroDocumento(6545655L);
        m2.setTipoDocumento(TipoDocumento.CC);
        
        System.out.println(m2.getNombres()+ " " +
                           m2.getApellidos()+" "+
                           m2.getNumeroDocumento());

     //paciente
     Paciente p= new Paciente(1, 
                            "Samuel",
                            "Perez",
                            TipoDocumento.CC,
                            6484646L,
                            "samuper@gmail.com",
                            3112588521L,
                            LocalDate.now(),
                            164.3,
                            95.6,
                            TipoSangre.O,
                             '+');
        //cconsulta
    Consulta c= new Consulta(1,
                            "Cra69#69 a32",
                             5156461); 
        //cita                     
    Cita cita=new Cita();
    cita.setFechaCita(LocalDateTime.of(2024, 02, 28, 13, 33, 1)); 
    cita.setEstadoCita(EstadoCita.AGENDADA); 
    
    System.out.println(cita.getFechaCita()+ " " +
                        cita.getEstadoCita());
    }

}