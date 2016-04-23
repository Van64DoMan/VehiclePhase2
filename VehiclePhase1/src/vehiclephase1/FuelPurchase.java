package vehiclephase1;

import java.text.DecimalFormat;

public class FuelPurchase 
{	
    //Variable types
    double cost, litres, average;

    //Create FuelPurchase class constructor and set default values 
    FuelPurchase()
    {
        cost = 0;
        litres = 0;
        average = 0;
    }
    
    //Create copy class constructor except add cost and litres values
    FuelPurchase(double money, double fuel)
    {
        cost = money;
        litres = fuel;
    }
    
    //Setters
    void setCost(double money) //Set cost
    {
        this.cost = average * this.litres;
    }
    
    void setLitre(double fuel) //Set litres
    {
        this.litres = average * this.cost;
    }
    
    void setAverage() //Calculate average cost of fuel
    {   
        average = cost/litres;
    }
    
    //Getters
    public double getFuelEconomy() //Get fuel economy by calculate fuel economy
    {
	return this.litres / 100;
    }
    
    double getAverage() //Get average from setAverage()
    {
        //Average will be in two decimal places
        DecimalFormat decimal = new DecimalFormat("#,##0.00");
        
        //Condition if litres or cost are less than or equal to 0
        if(litres <= 0 || cost <= 0)
        {
            //Nothing
        }
        
        //Else, display average
        else
        {
           System.out.println("The average cost of fuel was $" 
            + decimal.format(average) + " per litres");
        }
        
        return average;
    }
    
    double Cost() //Get cost
    {
        return this.cost;
    }

    double Litre() //Get litres
    {
        return this.litres;  
    }

}
