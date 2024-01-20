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
        
        System.out.println("Sedan Car built: " + sedan);
    }
}

