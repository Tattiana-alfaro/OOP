package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.List;
import java.util.Locale;

import static java.lang.Integer.parseInt;

public class BitacoraService {
    final private Repository repository;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean isAmigo, String relacion,
                     String facebook, String parentesco, String marca)
    {
        int edad = Integer.parseInt(txtEdad);
        Persona persona;
        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
        }

    }

    public List<String> get() {
        return  this.repository.get();
    }
}
