package com.ucreativa;

import com.ucreativa.familia.Tattiana;
import com.ucreativa.familia.Allan;

public class Main {

    public static void main(String[] args) {
        Tattiana me = new Tattiana("Hola, soy Tattiana", 30, "Leer");
        Allan father = new Allan("Hola, soy el padre de Tattiana", 50, "Granjero");

        System.out.println("Age: " + father.getAge());
        System.out.println("Hobby: " + father.getHobby());
        father.setBirthday();
        System.out.println("Birthday: " + father.getBirthday());

        System.out.println("Age: " + me.getAge());
        System.out.println("Hobby: " + me.getHobby());
        me.setBirthday();
        System.out.println("Birthday: " + me.getBirthday());
    }
}
