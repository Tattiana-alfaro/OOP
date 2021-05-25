package com.ucreativa;

import com.ucreativa.familia.Tattiana;
import com.ucreativa.familia.Allan;

public class Main {

    public static void main(String[] args) {
        Tattiana me = new Tattiana();
        Allan father = new Allan("Hola");

        System.out.println("Age: " + father.getAge());
        System.out.println("Hobby: " + father.getHobby());
        father.setBirthday();
        System.out.println("Birthday: " + father.getBirthday());
    }
}
