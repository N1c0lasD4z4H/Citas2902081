package org.ptech.citas.java.entities;
import java.time.LocalDate;

import org.ptech.citas.java.entities.enums.Especialidad;
import org.ptech.citas.java.entities.enums.TipoDocumento;
import org.ptech.citas.java.entities.enums.TipoSangre;

public class PruebasPolimorfismo {
    public static void main(String[] args) {
        //instanciar un uusario
            Usuario u = new Medico(1,
                         "Nicolas", 
                         "Daza", 
                         TipoDocumento.CC, 
                         132235542L,
                         478559L,
                         Especialidad.CARDIOLOGO);
          System.out.println(u.toString());  
          
          Usuario u1 = new Paciente(1, 
                    "fernado",  
                    "perez", 
                    TipoDocumento.TI, 
                    423214214324L, 
                    "FERPER@GMAIL.COM", 
                    333222L, 
                    LocalDate.now(), 
                    1.70, 
                    .69, 
                    TipoSangre.AB,
                    '+' 
                    );
        System.out.println(u1.toString());
        
        Usuario u2 = new Enfermero(2, 
                        "sam", 
                        "ferns", 
                        TipoDocumento.CC, 
                        35242424L);
        System.out.println(u2.toString());
                            
    }

}
