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
    void buildChassis();
    void buildEngine();
    void buildInterior();
    void buildExterior();
    void buildAccessories();
    Car getCar();
}
