package StockMarket;
/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #3
 *File Name: Order
 *Author: Denisolt Shakhbulatov
 *Date Created: 03/17/2016
 *Date Updated: 03/17/2016 class has been created
 *Description: This class is a parent class with two other classes, has a contrusctor and interface class MarketData
 *****************************************************************************************************************************************/
public class StockWatch
{
    String name;
    double price;
    public StockWatch(String name, double price)
    {
        this.name = name;
        this.price = price;
        System.out.println("Welcome to StockWatch");
    }
}

interface MarketData 
{
    public void data(String name, double price);
}

class Analysis extends StockWatch implements MarketData
{
    public void data(String name, double price)
    {
        System.out.println("Analysis is working for MarketData:");
        System.out.println("Stock Name: " + name +", Value: " + price);
    }

    public Analysis(String name, double price, double currentvalue)
    {
        super(name, price);
        int cashflow = 75000000;
        System.out.println("Analysis is working for StockWatch:");
        System.out.println("Stock Name: " + name + ", Book Value: " + price + ", Current Value: " + currentvalue + ", Cashflow: " + cashflow);
    }
}