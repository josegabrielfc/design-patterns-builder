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
public interface CarBuilder {
    CarBuilder withChassis(String chassis);
    CarBuilder withEngine(String engine);
    CarBuilder withInterior(String interior);
    CarBuilder withExterior(String exterior);
    CarBuilder withAccessories(String accessories);
    CarBuilder withColor(String color);
    Car build();
}
