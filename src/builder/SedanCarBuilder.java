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
public class SedanCarBuilder implements CarBuilder {

    private Car car;

    public SedanCarBuilder() {
        this.car = new Car("Sedan");
    }

    @Override
    public void buildChassis() {
        car.setChassis("Sedan Chassis");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Standard Engine");
    }

    @Override
    public void buildInterior() {
        car.setInterior("Basic Interior");
    }

    @Override
    public void buildExterior() {
        car.setExterior("Sleek Exterior");
    }

    @Override
    public void buildAccessories() {
        car.setAccessories("Standard Accessories");
    }

    @Override
    public Car getCar() {
        return car;
    }

}
