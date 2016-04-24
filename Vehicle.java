package vehiclephase2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Vehicle 
{
    DecimalFormat decimal = new DecimalFormat("#,###");
    //Any variables with 'decimal' as format will have whole number
    String manufacturer; //Company/manufacturer
    String model; //Model type
    int makeYear; //Year made
    Journey travel; //Journey class
    FuelPurchase fuel; //FuelPurchase class
    PerKmRental kmRental; //PerKmRental class
    PerDayRental dayRental; //PerDayRental class
    Service serviceRecord; //Service class

    ArrayList<Journey> journeyList = new ArrayList<>(); //ArrayList to Journey

    public Vehicle() //Create vehicle constructor and set default values
    {
        this.manufacturer = "Audi";
        this.model = "A6";
        this.makeYear = 2003;
        travel = new Journey();
	fuel = new FuelPurchase();
        dayRental = new PerDayRental(0, 0);
        serviceRecord = new Service(travel.getTotalServices(), 0);
    }
    
    //Create copy constructor
    public Vehicle(String manufacturer, String model, int makeYear, int serviceTimes)
    {
        this.manufacturer = manufacturer;
        this.model = model;
        this.makeYear = makeYear;
        travel = new Journey();
        fuel = new FuelPurchase(62,75);
        //kmRental = new PerKmRental(150);
        dayRental = new PerDayRental(150, 7);
        serviceRecord = new Service(serviceTimes, 150); //Assume this car meet service at 150km
    }
    
    //Getters
    public int Year() //Get makeYear
    {
        return makeYear;
    }
    
    public String getDetails() //Display vehicle name (manufacturer and model) and year
    {
	String str = "Vehicle: " + this.manufacturer +" " + this.model + " (" +this.makeYear +" model)";
	return str;
    }
    
    //Setters
    void setYear(int yearly)
    {
        //Year cannot be less than 1900 or greater than 2016
        if(yearly < 1900 || yearly > 2016)
        {
            System.out.println("Not valid year");
            System.exit(makeYear); //Stop program if condition met
        }
        
        else
        {
            this.makeYear = yearly; //makeYear becomes yearly
        }

    }
    
    //Print and get from Journey class
    public void printJourney(Journey journey)
    {
        travel.litres = fuel.Litre();
        travel.setService();
        System.out.println("Total Kilometres Travelled: " + decimal.format(travel.getKilometers()));
        //If kilometres greater than 0, display this message
        if(travel.kilometres > 0)
        {
            System.out.println("The vehicle should have an undergone " 
            + decimal.format(travel.service) + " services.");
        }
        travel.setFuelEconomy();
        travel.getFuelEconomy();
    }
    
    //Print and get from FuelPurchase class
    public void printFuelPurchase(FuelPurchase fuelPurchase)
    {
        fuel.setAverage();
        System.out.println("Total fuel capacity: " + decimal.format(fuel.Litre()) +"L");
	System.out.println("Total fuel cost: $" + decimal.format(fuel.Cost()));
        fuel.getAverage();
    }
    
    //Print and get from Service class, act like array
    public void printService(Service service)
    {
	System.out.println(service.getTravelKmLastService());
    }

    //Print and get from PerKmRental, act like array
    public void printPKRRevenue(PerKmRental pkr)
    {
        System.out.println(pkr.getRevenue());	
    }

    //Print and get from PerDayRental, act like array
    public void printPDRRevenue(PerDayRental pdr)
    {
        System.out.println(decimal.format(travel.kilometres) +"km raising: $" + decimal.format(pdr.getRevenue()));
    }

    //Print values from instance variables
    void printDetails()
    {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Make Year: " + makeYear);
    }
    
    //Print methods from this class
    void print()
    {
        printDetails();
        printJourney(travel);
        printFuelPurchase(fuel);
        System.out.println();
        //Print service record and get info from Service class
        System.out.println(serviceRecord.getInfo(this, travel)); //Get details from Vehicle and Journey's classes
        if(dayRental.revenue != 0) //When revenue not zero, print dayRental's print method
        {
            printPDRRevenue(dayRental);
        }
        System.out.println();
    }
    
    //Keep adding up distance from VehiclePhase2 class and store distance
    public void addKilometers(double distance) 
    {
	travel.addKilometers(distance);
    }

    //Add journey class to journeyList (arrayList)
    void addJourney(Journey journey1)
    {
        journeyList.add(journey1);
    }

}