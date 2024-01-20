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
        carBuilder.withChassis("Sedan Chassis");
        carBuilder.withEngine("Standard Engine");
        carBuilder.withInterior("Basic Interior");
        carBuilder.withExterior("Sleek Exterior");
        carBuilder.withAccessories("Standard Accessories + touch screen");
        carBuilder.withColor("White");
    }
    
    public Car getCar() {
        return carBuilder.build();
    }
}
