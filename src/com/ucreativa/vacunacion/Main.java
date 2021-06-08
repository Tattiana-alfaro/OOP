package com.ucreativa.vacunacion;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacuna;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.InMemoryRepository;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InMemoryRepository repo = new InMemoryRepository();
        String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, print;
        Persona persona;

        while (true) {
            System.out.println("Nombre: ");
            nombre = in.nextLine();

            System.out.println("Cedula: ");
            cedula = in.nextLine();

            System.out.println("Edad: ");
            edad = in.nextLine();

            System.out.println("Riesgo(S/N): ");
            riesgo = in.nextLine();

            System.out.println("Amigo(A)/Familiar (F): ");
            isAmigo = in.nextLine();

            if (isAmigo.toUpperCase(Locale.ROOT) == "A") {
                System.out.println("Relacion: ");
                relacion = in.nextLine();

                System.out.println("Facebook: ");
                facebook = in.nextLine();
                persona = new Amigo(nombre, cedula, parseInt(edad), riesgo.equals("S"), relacion, facebook);
            } else {
                System.out.println("Parentesco: ");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, parseInt(edad), riesgo.equals("S"), parentesco);
            }

            System.out.println("Marca: ");
            marca = in.nextLine();

            repo.save(persona, marca, new Date());
            System.out.println("Quiere Imprimir Lista(S)? ");
            print = in.nextLine();
            if (print.equals("S")){
                for (String item : repo.get())
                {
                    System.out.println(item);

                }
            }
        }
    }
}
