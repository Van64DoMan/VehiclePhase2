package vehiclephase2;

import java.text.DecimalFormat;

public class PerDayRental 
{    
    //Variable types, set rental to $100 per day, initialise revenue to 0
    double rental = 100;
    double revenue = 0;
    PerKmRental pkr; //Get from PerKmRental class

    //Create PerDayRental constructor with added kilometres from PerKmRental and added day
    public PerDayRental(double kilometres, int days) 
    {
	pkr = new PerKmRental(kilometres);
	this.revenue = pkr.getRevenue() * days; //Calculate revenue
    }

    //Getters
    public double getRevenue() //Get revenue 
    {
    	return this.revenue;
    }

    public double getRental() //Get rental from setRental
    {
    	return rental;
    }

    //Setter
    public void setRental(double rental) //Set rental 
    {
	this.rental = rental; //Constructor's rental becomes rental
    }

}
