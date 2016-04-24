package vehiclephase2;

import java.text.DecimalFormat;

public class Service 
{
    DecimalFormat decimal = new DecimalFormat("#,###");
    //Variable types
    double serviceTimes;
    double travelKmLastService;
    
    //Create Service class constructor with added serviceTimes and travelKmLastService
    public Service(double serviceTimes, double travelKmLastService)
    {
        this.serviceTimes = serviceTimes;	
        this.travelKmLastService = travelKmLastService;
    }
	
    //Getters
    String getInfo(Vehicle car, Journey travel) //Build string where Vehicle and Journey class' are parameters
    {
        //Create new StringBuilder from vehicle class' getDetails() called info
        //StringBuilder speeds up append and reduce more memory than individual string
        StringBuilder info = new StringBuilder(car.getDetails());
        //serviceTimes become Journey class' getTotalService()
        this.serviceTimes = travel.getTotalServices();
        if(serviceTimes >= 0 && serviceTimes < 1) //Service is between 0 and 1, include 0
        {
            //Print info
            info.append("\n No travel has been recorded yet.");
            info.append("\n The vehicle has not yet been serviced.");
        }
        else if(serviceTimes >= 1) //Service greater than or equal to 1
        {
            //Print this info only
            info.append("\n The vehicle last service at " + decimal.format(this.travelKmLastService) + "km"); 
            //If ((Journey class' kilometre) - 100) is greater than last service's kilometre
            //Eg. Journey class' kilometre = 295 and travelKmLastService = 150
            //295 - 100 > 150, (195 > 150), true statement
            if(travel.getKilometers() - 100 > this.travelKmLastService)
            {
                //Print error
                info.append("\n Error: Vehicle must be serviced first");
            }
        }
        return info.toString(); //return info
    }

    public double getServiceTimes() //Get serviceTimes from setServiceTimes()
    {
        return this.serviceTimes;
    }
    	
    public double getTravelKmLastService() //Get travelKmLastService from setTravelKmLastService()
    {
        return travelKmLastService;	
    }

    public void setServiceTimes(int serviceTimes) //Set serviceTimes
    {
        this.serviceTimes = serviceTimes; //Constructor's serviceTimes becomes serviceTimes	
    }

    public void setTravelKmLastService(double travelKmLastService) //Set travelKmLastService
    {
        this.travelKmLastService = travelKmLastService; //Constructor's travelKmLastService becomes travelKmLastService
    }

}
