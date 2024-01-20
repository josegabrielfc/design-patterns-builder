/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

/**
 *
 * @author jgfch
 */
public class Main {

    public static void main(String[] args) {
        UsuarioDTO user = new UsuarioDTO.Builder()
                .setName("Ana").setLastname("Lopez")
                .setEmail("123")
                .setPhoneNumber("31258312")
                .setBirthdate(LocalDate.now().format(DateTimeFormatter.ISO_DATE))
                .setGender("Hombre")
                .setCivilStatus("Soltero")
                .build();

        System.out.println("Nombre: " + user.getName());
        System.out.println("Apellido: " + user.getLastname());
        System.out.println("Correo electrónico: " + user.getEmail());
        System.out.println("Número de teléfono: " + user.getPhoneNumber());
        System.out.println("Fecha de nacimiento: " + user.getBirthdate());
        System.out.println("Género: " + user.getGender());
        System.out.println("Estado civil: " + user.getCivilStatus());
    }
}
