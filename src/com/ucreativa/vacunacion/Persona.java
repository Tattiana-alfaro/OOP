package com.ucreativa.vacunacion;

public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private Boolean riesgo;

    public Persona(String nombre, String cedula, int edad, Boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getCedula()
    {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public Boolean getRiesgo() {
        return riesgo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRiesgo(Boolean riesgo) {
        this.riesgo = riesgo;
    }

}
