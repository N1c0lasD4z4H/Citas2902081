package org.ptech.citas.java.entities;

public class Consulta {
    private int id;
    private String dirección;
    private int numero;
    public Consulta() {
    }
    public Consulta(int id, String dirección, int numero) {
        this.id = id;
        this.dirección = dirección;
        this.numero = numero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDirección() {
        return dirección;
    }
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    

}
