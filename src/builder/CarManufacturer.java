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
public class CarManufacturer {
    private CarBuilder carBuilder;

    public CarManufacturer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
    
    public void constructCar(){
        carBuilder.buildChassis();
        carBuilder.buildEngine();
        carBuilder.buildInterior();
        carBuilder.buildExterior();
        carBuilder.buildAccessories();
    }
    
    public Car getCar() {
        return carBuilder.getCar();
    }
}
