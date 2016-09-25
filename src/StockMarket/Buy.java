package StockMarket;
/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #2
 *File Name: Buy
 *Author: Denisolt Shakhbulatov
 *Date Created: 03/01/2016
 *Date Updated: 03/01/2016 the calss has been created
 *Description: This class is a child class of Order class, has a contrusctor and toString method to display the information
 *****************************************************************************************************************************************/
public class Buy extends Order
{
    double balance1;
    public Buy(String name, double value, double balance)
    {
        super(name, value);
        balance1 = balance;
    }

    public String toString()
    {
        String str = "Buy[super=Order[name = "+name1+" @, Price="+value1+", total =";
        return str;
    }
}
