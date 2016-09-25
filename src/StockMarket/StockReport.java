package StockMarket;
/****************************************************
 *Project Informaiton
 *Course: CSCI 185/504 Spring 2016
 *Project Name: Project #5
 *File Name: StockReport
 *Author: Denisolt Shakhbulatov
 *Date Created: 04/22/2016
 *Date Updated: 04/22/2016 class has been created
 *Description: This class uses printwriter, stores inputted information in arrays and creates a txt file with information in them
 *             Also DowSold class and DowBuy class extends StockReport. Project reads a txt file and gives an output.
 *****************************************************************************************************************************************/
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class StockReport 
{
    Scanner keyboard = new Scanner(System.in);
    String Name;
    StockReport(String Name) 
    {
        String dowNAme = Name;
    }

    public void DisplaySold() 
    {
        System.out.println("Starting Dow Jones Sold Report");
    }

    public void DisplayBuy() 
    {
        System.out.println("Starting Dow Jones Buy Report");
    }
}
     class DowSold extends StockReport 
    {
        String stockNAme;
        DowSold(String stockName) 
        {
            super(stockName);
            String STOCKname = stockNAme;
            try
            {
                int [] dow = new int [4];
                int [] Quantity = new int [4];
                double [] Price = new double [4];
                String [] name = new String [4];
                double total=0;
                double price;
                int quant;
                File file = new File("StockDataIn.txt");
                Scanner inFile = new Scanner(file);
                for(int i=0; i<4; i++)
                {
                    dow[i] = inFile.nextInt();
                    quant = inFile.nextInt();
                    Quantity[i] = quant;
                    price = inFile.nextInt();
                    Price[i] = price;
                    name[i] = inFile.nextLine();
                    total = total + (price*quant);
                    System.out.println("Sold " +Quantity[i] + " of "+  name[i] + " (DOW: " + dow[i]+") at $"+Price[i]+" each.");
                }
                System.out.println("The total: " + total);
                inFile.close();
            }
            catch(Exception e){
                System.err.println("Error occured");
            }
        }
    }
     class DowBuy extends StockReport 
    {
        String fileName;
        DowBuy(String dowName) 
        {
            super(dowName);
            String dowNAme = dowName;
            try
            {
                int [] dow = new int [4];
                int [] Quantity = new int [4];
                double [] Price = new double [4];
                String [] name = new String [4];
                double total=0;
                double price;
                int quant;
                Scanner kb = new Scanner(System.in);
                PrintWriter filesWrited = new PrintWriter("StockDataOut.txt");
                filesWrited.println("Dow  Quantity  Price  StockName");
                for(int i=0; i<4; i++)
                {
                    System.out.println("Enter Dow, Quantity, Price, StockName: ");
                    dow[i] = kb.nextInt();
                    quant = kb.nextInt();
                    Quantity[i] = quant;
                    price = kb.nextInt();
                    Price[i] = price;
                    name[i] = kb.nextLine();
                    total = total + (price*quant);
                    filesWrited.println(dow[i]+" "+Quantity[i]+"    "+Price[i]+" "+ name[i]);
                }
                filesWrited.println("The total: " + total);
                filesWrited.close();
            }
            catch(Exception e){
                System.err.println("File does not exist");
            }
        }
    }