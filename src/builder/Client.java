/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author jgfch
 */
public class Client {

    public static void main(String[] args) {
        CarBuilder sedanCarBuilder = new SedanCarBuilder();
        CarManufacturer manufacturer = new CarManufacturer(sedanCarBuilder);

        manufacturer.constructCar();
        Car sedan = manufacturer.getCar();

        System.out.println(sedan);

        Car mcqueen = new Builder("Rayo McQueen")
                .withChassis("Chassis McQueen")
                .withColor("Rojo")
                .withEngine("Motor Potente")
                .withInterior("Interior Deportivo")
                .withExterior("Carrocería Deportiva")
                .withAccessories("Luces LED")
                .build();
        System.out.println(mcqueen);
    }
}
