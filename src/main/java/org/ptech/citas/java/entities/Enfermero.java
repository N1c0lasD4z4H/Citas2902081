package org.ptech.citas.java.entities;

import java.util.ArrayList;
import java.util.List;

import org.ptech.citas.java.entities.enums.TipoDocumento;

public class Enfermero extends Usuario {
    private List<String> procedimientos;
    

    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + 
                        procedimientos +
                        ", nombre:" + 
                        super.nombres+
                        ", apellido:" +
                        super.apellidos + 
                        ", id enfermero" +
                        super.id
                        + "]";
    }

    public Enfermero(int id, 
                    String nombres, 
                    String apellidos, 
                    TipoDocumento tipoDocumento, 
                    Long numeroDocumento) {
        //1.constructor de la superclase                
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        //2.inicializar atributos intrinsecos del objeto
        this.procedimientos = new ArrayList<String>();                    
       
    }

    public void addProcedure(String procedure){
        //Añadir el procedimiento a la lista de procedimientos
        this.procedimientos.add(procedure);
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }


  
}
