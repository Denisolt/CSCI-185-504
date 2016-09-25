package StockMarket;

/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #2
 *File Name: Order
 *Author: 
 *Date Created: 03/01/2016
 *Date Updated: 03/01/2016 the calss has been created
 *Description: This class is a parent class for two other classes, has a contrusctor and toString method to display the information
 *****************************************************************************************************************************************/
public class Order
{
    double value1;
    String name1;
    public Order(String name, double value)
    {
        name1 = name;
        value1 = value;
    }   
    
    public String toString()
    {
        String str = "Order[name = "+name1+" Current Price:, Price="+value1+"]";
        return str;
    }
}