/**
 * (The Stock class) Following the example of the Circle class in Section 9.2,
 * design a class named Stock that contains:
 * 
 * ■ A string data field named symbol for the stock’s symbol.
 * ■ A string data field named name for the stock’s name.
 * ■ A double data field named previousClosingPrice that stores the stock
 * price for the previous day.
 * ■ A double data field named currentPrice that stores the stock price for the
 * current time.
 * ■ A constructor that creates a stock with the specified symbol and name.
 * ■ A method named getChangePercent() that returns the percentage changed
 * from previousClosingPrice to currentPrice.
 * 
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates a Stock object with the stock symbol ORCL, the name
 * Oracle Corporation, and the previous closing price of 34.5. Set a new current
 * price to 34.35 and display the price-change percentage.
 * 
 * Author: chill4Eng2Dev 
 * Date: 1/27/2021
 * Book: Introduction to Java Programming, 10th Edition, Y. Daniel Liang
 * Exercise: 9.2
 */

public class EX02_TestStock {
    
    public static void main(String[] args) {
        
        // initialize a stock object
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        
        // print output as described in problem statement
        System.out.printf("\nThe price-change percentage is: %2.2f %%",stock.getChangePercent(stock.previousClosingPrice, stock.currentPrice));
        
    }

}
