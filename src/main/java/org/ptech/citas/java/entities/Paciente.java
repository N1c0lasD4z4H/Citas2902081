package org.ptech.citas.java.entities;
import java.time.LocalDate;

public class Paciente {
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private String email;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    //constructores
    public Paciente() {
    }

    
    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            String email, Long celular, LocalDate fechaNacimiento, Double altura, Double peso, TipoSangre tipoSangre,
            char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    //setter y getter
  

    

}
