package StockMarket;

/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #2
 *File Name: Sell
 *Author: 
 *Date Created: 03/01/2016
 *Date Updated: 03/01/2016 the calss has been created
 *Description: This class is a child class of Order class, has a contrusctor and toString method to display the information
 *****************************************************************************************************************************************/
public class Sell extends Order
{
    String sector1;
    public Sell(String name, double value, String sector)
    {
        super(name, value);
        sector1 = sector;
    }

    public String toString()
    {
        String str = "Sell[super=Order[name = "+name1+" @, Price="+value1+"],Stock Market Sector =" + sector1;
        return str;
    }
}
