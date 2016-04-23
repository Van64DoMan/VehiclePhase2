/*
Creator:
        Van Do
Creation Date:
        31/03/2016
Methods:
        + void main(String[] args)
Classes this class require
        Vehicle
Classes that require this class
        Journey and FuelPurchase
TO DO:
        Record vehicle's details, journey details and fuel purchase details (completed 17/04/2016)
*/
package vehiclephase1;
import java.util.*;

public class VehiclePhase1 
{
    public static void main(String[] args) 
    {	
        //Default vehicle with 0 values only
        Vehicle start = new Vehicle();
        //Print details to clear default vehicle details only
        start.print();
        //New data released
        Vehicle car = new Vehicle("Audi", "A6", 2003);
        
        for (int count = 0; count < 10; count++) 
        {
            car.addKilometers(new Random().nextInt(50));
            //Random using any number from 0 to 50 inclusively and add to kilometres
	}
        //Continue this loop 10 times
        
        car.print();
        //Print new details from that vehicle
    }
    
}
