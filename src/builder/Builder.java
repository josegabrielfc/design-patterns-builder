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
public class Builder implements CarBuilder {

    private Car car;

    public Builder(String name) {
        this.car = new Car(name);
    }

    @Override
    public CarBuilder withChassis(String chassis) {
        car.setChassis(chassis);
        return this;
    }

    @Override
    public CarBuilder withEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder withInterior(String interior) {
        car.setInterior(interior);
        return this;
    }

    @Override
    public CarBuilder withExterior(String exterior) {
        car.setExterior(exterior);
        return this;
    }

    @Override
    public CarBuilder withAccessories(String accessories) {
        car.setAccessories(accessories);
        return this;
    }

    @Override
    public CarBuilder withColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
