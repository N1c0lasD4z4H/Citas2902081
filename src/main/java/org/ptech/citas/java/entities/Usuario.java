package org.ptech.citas.java.entities;

import org.ptech.citas.java.entities.enums.TipoDocumento;
//clase padre//
//clase abstracta: no puede instanciarse, se utiliza "abstract" en superclases
public  class Usuario {
    //atributos a heredarse deben ser protected
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected TipoDocumento tipoDocumento;
    protected Long numeroDocumento;

    //sobreescribir el metodo to string
    public String toString(){
        return "nombre:" + this.nombres;
    }
    
    public Usuario(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


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

    

    
}
