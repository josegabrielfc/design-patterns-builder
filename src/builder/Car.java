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
public class Car {

    private String chassis;
    private String engine;
    private String interior;
    private String exterior;
    private String accessories;

    public Car(String type) {
        // Initialize the basic properties
    }

    public String getChassis() {
        return chassis;
    }

    public String getEngine() {
        return engine;
    }

    public String getInterior() {
        return interior;
    }

    public String getExterior() {
        return exterior;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Car {\n"
                + "chassis='" + chassis + "'\n"
                + "engine='" + engine + "'\n"
                + "interior='" + interior + "'\n"
                + "exterior='" + exterior + "'\n"
                + "accessories='" + accessories + "'\n"
                + '}';
    }
}