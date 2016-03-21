/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author jamesmorin
 */
public abstract class car {
    
    private String fuelType;
    private int fuelLevel;
    private int fuelPrice;

    public car(String fuelType, int fuelLevel, int fuelPrice) {
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
        this.fuelPrice = fuelPrice;
    }
    
    public void fuelUp(){
        System.out.println("Drive Safe!");
    }
    
    public void goOnSale(){
        System.out.println("What a Deal!");
    }
    
    public void honk(){
        System.out.println("beep!");
    }
    
    public void drive(){
        System.out.println("zoom!");
    }
    
    

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(int fuelPrice) {
        this.fuelPrice = fuelPrice;
    }
    
    
    
 
    
}
