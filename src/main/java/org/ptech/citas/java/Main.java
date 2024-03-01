package org.ptech.citas.java;


import org.ptech.citas.java.entities.Enfermero;
import org.ptech.citas.java.entities.Medico;
//import org.ptech.citas.java.entities.Cita;
//import org.ptech.citas.java.entities.Consulta;
//import org.ptech.citas.java.entities.Medico;
//import org.ptech.citas.java.entities.Paciente;
import org.ptech.citas.java.entities.enums.Especialidad;
//import org.ptech.citas.java.entities.enums.EstadoCita;
import org.ptech.citas.java.entities.enums.TipoDocumento;
//import org.ptech.citas.java.entities.enums.TipoSangre;



public class Main {
    public static void main(String[] args) {
        //crear medico
        Medico m1 = new Medico(1,
                        "Nicolas",
                        "Daza",
                        TipoDocumento.CC,
                        545645L,
                        5454L,
                        Especialidad.CARDIOLOGO);
    System.out.println("id del medico :" + m1.getId() +
                        "nombre :" + m1.getNombres()+ 
                        "apellido: " + m1.getApellidos());

        Enfermero e1 = new Enfermero(1, 
                            "Samuel", 
                            "Fernandez", 
                            TipoDocumento.CC, 
                            8789797L);
        System.out.println("id enfermero:" + e1.getId() + "nombre:" + e1.getNombres());                      
                            
        //añadir dos procedimientos al enfermero
        e1.addProcedure("aplicar inyecciones");
        e1.addProcedure("lavado de oidos");

        //recorrer procedimientos de e1
        for(String p : e1.getProcedimientos()){
            System.out.println("procedimiento" + p);       
        }
                                            
}
}