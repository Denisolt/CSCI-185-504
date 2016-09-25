package StockMarket;

/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #1
 *File Name: wallStreet
 *Author: 
 *Date Created: 02/05/2016
 *Date Updated: 02/19/2016 There are some changes for the class wallStreet where a new class or variable has been added.
 *Description: This project will allow the user to enter his choice and select his company to trade with (Dow Joend, NASDAQ, and S&P 500)
 *             The project will print out the number of shares and the toatal price.
 *****************************************************************************************************************************************/
import java.util.Scanner;
public class wallStreet
{
    public int currentDow;
    public int closePriceDow;
    public int openPriceDow;
    public int lowPriceDow;
    public int currentNas;
    public int closePriceNas;
    public int openPriceNas;
    public int lowPriceNas;
    public int currentSp;
    public int closePriceSp;
    public int openPriceSp;
    public int lowPriceSp;
    public int numberOfShares = 0;
    public int totalPriceforDow = 0;
    public int totalPriceforNas = 0;
    public int totalPriceforSP = 0;
    public int numberOfSharesDow = 0;
    public int numberOfSharesNas = 0;
    public int numberOfSharesSP = 0;
    public int totalPrice = 0;
    public boolean again; 

    Scanner keyboard = new Scanner (System.in);

    public void marketPlace(String company)
    {
        enterTrade(company);
    }

    public void enterTrade(String company)
    {
        again = false;
        switch (company.toUpperCase()) 
        {
            case "DOW":
            if(currentDow> openPriceDow && closePriceDow < lowPriceDow)
            {
                System.out.print("number of shares: ");
                int buy = keyboard.nextInt();
                numberOfSharesDow += buy; 
                totalPriceforDow += numberOfSharesDow * currentDow;
            }
            else
                again = false;
            break;
            case "NAS":
            if(currentNas> openPriceNas && closePriceNas < lowPriceNas)
            {
                System.out.print("number of shares: ");
                int buy = keyboard.nextInt();
                numberOfSharesNas += buy; 
                totalPriceforNas += numberOfSharesNas * currentNas;
            }
            else
                again = false;
            break;
            case "SP":   
            if(currentSp> openPriceSp && closePriceSp < lowPriceSp)
            {
                System.out.print("number of shares you wish to: ");
                int buy = keyboard.nextInt();
                numberOfSharesSP += buy; 
                totalPriceforSP += numberOfSharesSP * currentSp;
            }
            else
                again = false;
            break;
            default:
            again = false;
            break;
        }
    }
}

