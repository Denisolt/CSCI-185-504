package StockMarket;
import java.util.Scanner;
/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #4
 *File Name: Order
 *Author: Denisolt Shakhbulatov
 *Date Created: 04/15/2016
 *Date Updated: 04/15/2016 class has been created
 *Description: This class is throws a exception and catches it depending weather order can or can not be proceeded.
 *             It will ask user how much he wants to spend and how many shares he wants to buy
 *****************************************************************************************************************************************/
public class newBuy
{
    public void startBuy()
    {
        Scanner kb = new Scanner(System.in);
        int sharePrice = 70;
        int orderPrice;
        try
        {
            System.out.print("Enter the number of shares you wish to buy: ");
            int numOfShares = kb.nextInt();
            System.out.print("Enter the amount of money you would like to spend: ");
            orderPrice = kb.nextInt();
            if(orderPrice<sharePrice*numOfShares)
            {
                throw new Exception();
            }
            else
            {
                System.out.println("Order was processed, the value is: " + (sharePrice*numOfShares));
            }
        }
        catch(Exception e){
            System.out.println("Order can not be processed due to the lack of money");
        }
    }
}