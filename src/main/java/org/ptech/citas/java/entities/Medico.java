package org.ptech.citas.java.entities;

public class Medico {
    //POR REGLA GENERAL:
    //Los atributos siempre
    // debe ser privados
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private Long registroMedico;
    private Especialidad especialidad;
    //constructor
    public Medico() {
    }

    //constructor parametizado
    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
    Long registroMedico, Especialidad especialidad) {
    this.id = id;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.registroMedico = registroMedico;
    this.especialidad = especialidad;
    }

    //getters y setters deben ser publicos
    //firma de un Getter:
    //Tipo dato de retorno : es el t.d del atributo
    //Nombre del metodo:
    //        get del nombre 
    //-Parametros 0
    //-Retorna al valor del atributo
    public String getNombres() {
        //return sirve para retornar el valor al invocante(main)
        return this.nombres;
    }

    //Setter: sirve para asignar una valor a un atributo privado
    //firma de un setter:
    //-tipo de dato de retorno:void
    //-Nombre: set seguido nombre atributo
    //-Parametros :1 input del valor a asignar al atributo
    //-Retorna: nada
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    //paciente
    public Paciente(1,"Samuel",)
    //
   
    
    


    

}
