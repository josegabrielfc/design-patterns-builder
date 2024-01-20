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
    
    private String name;
    private String chassis;
    private String engine;
    private String interior;
    private String exterior;
    private String accessories;
    private String color;

    public Car(String name) {
       this.name = name;
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

    public String getColor() {
        return color;
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

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Car: "+ name +"{\n"
                + "chassis='" + chassis + "'\n"
                + "color='" + color + "'\n"
                + "engine='" + engine + "'\n"
                + "interior='" + interior + "'\n"
                + "exterior='" + exterior + "'\n"
                + "accessories='" + accessories + "'\n"
                + '}';
    }
}