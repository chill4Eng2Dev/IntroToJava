           // UML Class Diagram                     
/***************************************************
*                   Account                        *  
* -------------------------------------------------*  
* -id: int                                         *
* -balance: double                                 *
* -annualInterestRate: double                      *
* -dateCreated: Date                               *
* -------------------------------------------------* 
* +Account()                                       *
* +Acount(id: int, balance: double)                *
* +getId(): int                                    *
* +setId(id: int): void                            *
* +getBalance(): double                            *
* +setBalance(balance: double): void               *
* +getAnnualInterestRate(): double                 *
* +setAnnualInterestRate(annualInterestRate:       *
*       double): void                              *
* +getDate(): Date                                 *
* +getMonthlyInterestRate(): double                *
* +getMonthlyInterest(): double                    *
* +withdraw(amount: double)                        *
* +deposit(amount: double)                         *
***************************************************/

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    // default constructor
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    // constructor that accepts user defined id and balance    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    /** accessor methods */
    // return account id
    public int getId() {
        return id;
    }
    
    // return account balance
     public double getBalance() {
        return balance;
    }
    
    // return annual interest rate 
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    // return date that the account was created
    public Date getDate() {
        return dateCreated;
    }
    
    // return monthly interest rate which is annual / (12 months * 100) for percentage
    public double getMonthlyInterestRate() {
        return annualInterestRate / (12 * 100);
    }
    
    // return monthly interest rate which is the dollar value of the interest
    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }
    
    /** mutator methods */
    // method to change account id    
    public void setId(int id) {
        this.id = id;
    }
    
    // method to change balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    // method to change annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    /** other methods */
    // method that subtracts an amount from the balance
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    
    // method that adds an amount to the balance
    public void deposit(double amount) {
        this.balance += amount;
    }
    
}
