package org.ptech.citas.java.entities;

import org.ptech.citas.java.entities.enums.Especialidad;
import org.ptech.citas.java.entities.enums.TipoDocumento;
//clases que heredan:
//-clase hijas,subclase,detalle,especificas
public class Medico extends Usuario{
    private long registroMedico;
    private Especialidad especialidad;

    public Medico(int id, 
                String nombres,
                 String apellidos, 
                 TipoDocumento tipoDocumento, 
                 Long numeroDocumento,
                 long registroMedico,
                 Especialidad especialidad) {
    //Super: hace referencia al estado (atributos), comportamiento(metodos) de la clase padre
    //si quieres instanciar un medico tambien debes instanciar el usuario 
    //super en el constructor de la clase padre(siperclase)
    //super() llamada al constructor debe ser lo primero quw aparezca en el constructor de la clase hija              
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        // a continuacion inicializamos atributos propios de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    

    
   
    
    


    

}
