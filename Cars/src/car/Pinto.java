/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.Scanner;

/**
 *
 * @author jamesmorin
 */
public class Pinto extends car{
    
    Scanner sc = new Scanner(System.in);
    
    public Pinto(String fuelType, int fuelLevel, int fuelPrice){
        super(fuelType, fuelLevel, fuelPrice);
    }
    
    public Pinto(){
        super("Gas", 14, 2);
    }
    
    @Override
    public void fuelUp(){
        
        System.out.println("What type of fuel would you like to add to your new Pinto?");
        System.out.println("1: Gas \n"
                + "2: Diesel \n"
                + "3: Ethanol \n");
        int userChoice = sc.nextInt();
        
        if (userChoice != 1){
            System.out.println("Oh my Heavens! You KILLED it! (wrong type of gas)");
        }else{
            System.out.println("Thanks for fueling up, and enjoy driving your NEW CAR!");
        }
    
    }
    
    @Override
    public void goOnSale(){
        System.out.println("Your Pinto is on sale today! It only costs " + (20000 * 0.75) + " What a Deal!");
    }
    
    @Override
    public void honk(){
        System.out.println("beep!");
    }
    
    @Override
    public void drive(){
        System.out.println("zoom!");
        
    }
    
}
