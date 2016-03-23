/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jamesmorin
 */
public class Pinto extends car {

    Random ran = new Random();
    Scanner sc = new Scanner(System.in);

    int hybridChance = ran.nextInt(4);

    public Pinto(String fuelType, int fuelLevel, int fuelPrice) {
        super(fuelType, fuelLevel, fuelPrice);
    }

    public Pinto() {
        super("Gas", 14, 2);
    }

    @Override
    public void fuelUp() {

        System.out.println("What type of fuel would you like to add to your new Pinto?");
        System.out.println("1: Gas \n"
                + "2: Diesel \n"
                + "3: Ethanol \n");
        int userChoice = sc.nextInt();

        if (userChoice != 1) {
            System.out.println("You have used the wrong fuel the car will no longer start");
        } else {
            System.out.println("Thanks for fueling up, and enjoy driving your NEW CAR!");
        }

    }

    @Override
    public void goOnSale() {
        System.out.println("\n" + "Your Pinto is on sale today! It only costs $" + (20000 * 0.75) + " What a Deal! \n");
    }

    @Override
    public void honk() {
        System.out.println("beep! \n");
    }

    @Override
    public void drive() {
        //the ford pinto gets an estimated 34 mpg

        if (hybridChance == 3) {
            driveHybrid();
        }

        System.out.println("How many miles are you driving?");
        int userChoice = sc.nextInt();

        if (userChoice > (34 * 14)) {
            System.out.println("Oh No, you are out of fuel!");
        } else {
            System.out.println("Hope you had a nice trip. You have "
                    + ((14) - (userChoice / 34)) + " gallons of fuel left \n");
        }

        System.out.println("zoom!");

    }

    public void driveHybrid() {

        System.out.println("How many miles are you driving?");
        int userChoice = sc.nextInt();

        if (userChoice > (50 * 14)) {
            System.out.println("Oh No, you are out of fuel!");
        } else {
            System.out.println("Hope you had a nice trip. You have "
                    + ((14) - (userChoice / 50)) + " gallons of fuel left \n");
        }

        System.out.println("zoom!");

    }

}
