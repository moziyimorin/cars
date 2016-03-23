/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jamesmorin
 */
public class CarLot {

    public static void main(String[] args) {
        Random ran = new Random();
        int saleChance = ran.nextInt(4);
        int hybridChance = ran.nextInt(4);

        ArrayList<car> cars = new ArrayList<>();

        switch (ran.nextInt(3)) {
            case 0:
                cars.add(new Pinto());
                break;
            case 1:
                cars.add(new Pinto());
                break;
            case 2:
                cars.add(new Pinto());
                break;
        }

        for (car myCar : cars) {
            System.out.println(myCar.getFuelType());
            myCar.fuelUp();
            myCar.honk();
            myCar.drive();

            if (saleChance == 3) {
                myCar.goOnSale();
            }
        }

    }

}
