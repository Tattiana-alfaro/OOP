package com.ucreativa.vacunacion;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacuna;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Familiar pareja = new Familiar("Adrian", "AAA-123",
                33, false, "Pareja");

        Familiar padre = new Familiar("Allan", "BBB-123",
                51, true, "Padre");

        Amigo compaTrabajo = new Amigo("Oscar", "CCC-456",
                38, false, "Trabajo", "No se");

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(pareja);
        listaPersonas.add(padre);
        listaPersonas.add(compaTrabajo);

        List<BitacoraVacuna> bitacora = new ArrayList<>();
        bitacora.add(new BitacoraVacuna(pareja, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacuna(padre, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacuna(compaTrabajo, "Pfizer", new Date()));


    }
}
