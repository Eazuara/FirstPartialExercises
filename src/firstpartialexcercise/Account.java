/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexcercise;

/**
 *
 * @author esteb
 */
public class Account {
    private String id;
    private String name;
    private int balance=0;
    
    
    public Account( String id, String name){
       this(id,name,0);
    }
    public Account( String id, String name,int balance){
        this.id=id;
        this.balance=balance;
        this.name=name;
    }
    public String getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public int getbalance(){
        return this.balance;
    }
    public int credit(int amount){
        this.balance+=amount;
        return this.balance;
    }
    public int debit(int amount){
        if(amount<= this.balance){
            this.balance-=amount;
        }else{ System.out.println("Amount exceeded balance");
       
    }
        return this.balance;
}
    public int transferTo( Account another,int amount){
      if(amount<=balance){
          another.credit(amount);
          this.balance-=amount;
      }  else{ System.out.println("Amount Exceeded balance");
      
      }
      return this.balance;
    }
    @Override
    public String toString(){
        return "Account [ id " + this.id + ", name" + this.getname() + ", balance" + this.balance + "]";
    }
    
}

      
