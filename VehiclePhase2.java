/*
Creator:
        Van Do
Creation Date:
        10/04/2016
Methods:
        + void main(String[] args)
Classes this class require
        Vehicle
Classes that require this class
        Journey, FuelPurchase, PerKmRental, PerDayRental and Service
TO DO:
        Verify vehicle's service details (completed 17/04/2016)
*/
package vehiclephase2;

import java.util.*;

public class VehiclePhase2
{
    
    public static void main(String[] args) 
    {	
        //Test vehicle
        Vehicle start = new Vehicle();
        start.print();
        // Vehicle car = new Vehicle("Audi", "A6", 2003);
        Vehicle car = new Vehicle("Audi", "A6", 2003, 2);
        
        //Continue this loop 2 times for further distances/new details because of addKilometers kept adding
        for(int addUp = 0; addUp < 2; addUp++)
        {
            for (int count = 0; count < 10; count++) 
            {
                car.addKilometers(new Random().nextInt(50));
                //Random using any number from 0 to 50 inclusively and add to kilometres
            }
            //Continue this loop 10 times
        
            System.out.println("=============progressive==============");
        
            System.out.println("\n");
            //Print service details
        
            car.print();
            //Print new car details
	
        }
    }
}
