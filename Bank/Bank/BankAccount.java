package Bank;

import java.util.ArrayList;

public class BankAccount {

    private String number;
    private double balance;
    public final ArrayList<Customer> customers;
    public final ArrayList<Card> cards;

    public BankAccount(String number, double balance){
        this.number=number;
        this.balance=balance;
        customers=new ArrayList<Customer>();
        cards= new ArrayList<Card>();
    }

    public String getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }
    public void setNumber(String name){
        this.number=number;

    }

    public void setBalance(double balance){
        this.balance=balance;
    }

}
