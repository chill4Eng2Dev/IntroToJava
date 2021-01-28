           // UML Class Diagram                     
/***************************************************
*                   Stock                          *  
* -------------------------------------------------*  
* +symbol: String                                  *
* +name: String                                    *
* +previousClosingPrice: double                    *
* +currentPrice: double                            *
* -------------------------------------------------* 
* +Stock(symbol: String, name: String)             *
* +getChangePercent(previousClosingPrice: double,  *
*       currentPrice: double): double              *
***************************************************/

public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    // constructor that takes symbol and name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    // method to calculate the stock price change
    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
    
}
