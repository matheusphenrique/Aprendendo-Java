package Exercicios_OrientadaObjetos.bankAccount.entiites;

public class Account {
    
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double intialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(intialDeposit);
    }

    public int getNumber(){
        return number;
    }
    
    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getHolder(){
        return holder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
               +number
               +", Holder: "
               +holder
               +", Balance: $ "
               +String.format("%.2f", balance);
    }
}
