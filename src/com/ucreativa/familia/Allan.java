package com.ucreativa.familia;

public class Allan {
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String saludo;
    String nombre;

    public  Allan ()
    {
        this.nombre = "Allan Alfaro Bogantes";
        this.saludo = "Hola, mi es " + this.nombre + ", yo soy el padre de Tattiana";
        System.out.println(saludo);
    }

}
