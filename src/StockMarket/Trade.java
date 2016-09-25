package StockMarket;

/****************************************************
 *Project Information
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #1, #2 and #3. #4 and #5
 *File Name: Trade
 *Author: 
 *Date Created: 02/05/2016
 *Date Updated: 04/15/2016 Project 4 has been added
 *Description: This project will allow the user to enter his choice and select his company to trade with (Dow Jones, NASDAQ, and S&P 500)
 *             also it will run the parent class Order and children classes Buy and Sell, and will run StockWatch class with interface class
 *             The project will print out the number of shares and the total price, ask the user how many shares of Apple he wants to buy,
 *             print out number of order, sell and buy shares. Also it will print out analysis for StockWatch and MarketData for different 
 *             objects. Class newBuy will throw a exception and catch it afterwards depending weather order can or can not be proceeded. 
 *             Class StockReport will create a txt file with the data and will read a txt file with data. 
 *****************************************************************************************************************************************/
import java.util.Scanner;
import java.io.*;
public class Trade
{
    public static void main(String [] args) throws IOException
    {
        System.err.println("Start of Project 1.");
        wallStreet dowObject = new wallStreet();
        wallStreet nasObject = new wallStreet();
        wallStreet spObject = new wallStreet();
        wallStreet main = new wallStreet();
        String company;
        do
        {
            System.out.println("enter DOW");
            System.out.println("enter NAS ");
            System.out.println("enter SP");
            System.out.print("select your choice: ");
            Scanner keyboard = new Scanner (System.in);
            company = keyboard.nextLine();

            dowObject.currentDow = 22;
            dowObject.closePriceDow = 25;
            dowObject.openPriceDow = 18;
            dowObject.lowPriceDow = 30;

            nasObject.currentNas  = 5;
            nasObject.closePriceNas = 15;
            nasObject.openPriceNas= 1;
            nasObject.lowPriceNas = 29;

            spObject.currentSp = 45;
            spObject.closePriceSp = 6;
            spObject.openPriceSp = 16;
            spObject.lowPriceSp = 12;

            nasObject.marketPlace(company);
            dowObject.marketPlace(company);
            spObject.marketPlace(company);
        }
        while (company.equalsIgnoreCase("DOW")||company.equalsIgnoreCase("NAS")||company.equalsIgnoreCase("SP"));
        System.out.println();
        System.out.println("Dow Jones: "+dowObject.numberOfSharesDow + " shares with price: $"+ dowObject.totalPriceforDow);
        System.out.println("NASDAQ:  "+nasObject.numberOfSharesNas + " shares with price: $"+ nasObject.totalPriceforNas);
        System.out.println("S&P 500:  "+spObject.numberOfSharesSP + " shares with price: $"+ spObject.totalPriceforSP);
        int totalshares = spObject.numberOfSharesSP + dowObject.numberOfSharesDow +nasObject.numberOfSharesNas;
        int totalprice = spObject.totalPriceforSP + dowObject.totalPriceforDow + nasObject.totalPriceforNas;
        System.out.println("The total number of shares for all stocks:  " + totalshares);
        System.out.println("The total price of all stocks: $" + totalprice);
        System.out.println();
        //Project 2 
        System.err.println("Start of Project 2.");
        System.out.println();
        double totalpurchase;
        Scanner kb = new Scanner (System.in);
        System.out.print("Enter the number of AAPL shares you wish to buy: ");
        int aaplShares = kb.nextInt();

        Order oObj = new Order("Apple",192.5);
        Sell sObj = new Sell("Apple",193.0,"Technology");
        Buy bObj = new Buy("Apple",192.0,10000);
        System.out.println("Here are the results");
        totalpurchase = aaplShares * oObj.value1;
        System.out.println(oObj);
        System.out.println(sObj);
        System.out.println(bObj + " " + totalpurchase +"]");

        if(totalpurchase > bObj.balance1)
            System.out.println("Your order has been cancelled.");
        else
            System.out.println("Your order has been accepted.");
        System.out.println();
        ////Project 3
        System.err.println("Start of Project 3.");
        System.out.println();
        Analysis Anal = new Analysis("MSFT", 45.98, 125.55);
        StockWatch stock  = new Analysis("AApl", 95.25, 101.89);
        MarketData market = new Analysis("AA", 85.75, 145.95);
        MarketData market2 = new Analysis("GM", 105.2, 165.39);
        market.data("INTE", 185.98);
        System.out.println();
        ////Project 4
        System.err.println("Start of Project 4.");
        newBuy order = new newBuy();
        order.startBuy();
        ////Project 5
        System.err.println("Start of Project 5.");
        StockReport file = new StockReport("");
        file.DisplaySold();
        DowSold file1 = new DowSold("");
        file.DisplayBuy();
        DowBuy file2 = new DowBuy("");
    }
}
