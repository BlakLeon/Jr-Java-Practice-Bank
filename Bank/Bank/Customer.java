package Bank;

import java.util.ArrayList;

public class Customer  {
    private String name;
    public final ArrayList<BankAccount>   bankAccounts;
    public final ArrayList<Card> cards;




    public Customer(String name) {
        this.name = name;
        bankAccounts= new ArrayList<BankAccount>();
        cards= new ArrayList<Card>();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public ArrayList<BankAccount> getBankAccounts(){
        return bankAccounts;
    }
    public void addToBankAccounts(BankAccount b){
        bankAccounts.add(b);
    }
    public ArrayList<Card> getCards(){
        return cards;
    }




}
