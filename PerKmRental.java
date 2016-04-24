package vehiclephase2;

public class PerKmRental
{    
    //Variable type, set rental to $1 per day, initialise revenue to 0
    double rental = 1;
    double revenue = 0;

    //Create PerKmRental constructor with added kilometres
    public PerKmRental(double kilometres) 
    {
        this.revenue = this.rental * kilometres; //Calculate revenue
    }

    //Getters
    public double getRevenue() //Get revenue from constructor
    {
        return this.revenue;	
    }

    public double getRental() //Get rental
    {
        return rental;	
    }

    //Setter
    public void setRental(double rental) //Set rental
    {
        this.rental = rental; //Constructor's rental becomes rental
    }

}
