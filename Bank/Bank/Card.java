package Bank;

import java.util.ArrayList;

public class Card  {

    private String code;
    private Customer customer;
    public final ArrayList<BankAccount> bankAccounts;

    public Card(String code){
        this.code=code;
        bankAccounts = new ArrayList<BankAccount>();

    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){

        this.code=code;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer( Customer customer){
        this.customer=customer;
    }


}
