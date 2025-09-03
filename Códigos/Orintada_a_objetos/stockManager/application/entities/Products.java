package Orintada_a_objetos.stockManager.application.entities;

public class Products {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){

        return price * quantity;
        
    }

    public void addProducts(int quantity){
        
        this.quantity += quantity;

    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;
        
    }
}
