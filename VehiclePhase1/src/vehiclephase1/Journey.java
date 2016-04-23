package vehiclephase1;

import java.text.DecimalFormat;

public class Journey 
{
    double kilometres, service, litres, fuelEconomy;

    public Journey() //Create Journey class constructor and set default values
    {    
        kilometres = 0;
    }
    
    //Setters
    public void setTravel(double travel) //Set kilometres
    {
        this.kilometres = travel;
    }
        
    public void setService() //Calculate service
    {   
        service = kilometres / 100;
        
        service = Math.floor(service); //Service rounded down e.g 5.6 will be 5
        
        if(service < 0) //Service becomes 0 if negative
        {
            service = 0;
        }    
    }

    void setFuelEconomy() //Calculate fuel economy
    {   
        fuelEconomy = (litres/kilometres)*100;
    }
    
    public void addKilometers(double kilometers) //Add kilometres to make total
    {
	this.kilometres += kilometers;
    }
   
    //Getters
    double getFuelEconomy() //Get from setFuelEconomy()
    {
        //Fuel economy will be in one decimal place
        DecimalFormat dec = new DecimalFormat("#,##0.0");  
        
        //Condition if litre or distance are less than or equal to 0
        if(litres <= 0 || kilometres <= 0)
        {
            //Nothing
        }
        
        //Else, display fuel economy
        else
        {
            System.out.println("This vehicle achieved a fuel economy of " +
            dec.format(fuelEconomy) + "litres/100km.");
        }
        
        return fuelEconomy;
    }

    public double getTotalServices() //Get from setService
    {
        DecimalFormat dec = new DecimalFormat("####");
        //Service makes into whole number
        
        if(kilometres <= 0)
        {
            //Nothing
        }
        
        //Else, display service
        else
        {
            System.out.println("The vehicle should have an undergone " 
            + dec.format(service) + " services.");
        }
        
        return service;
    }

    public double getKilometers() //Get from addKilometers
    {
        return kilometres;
    }

}

