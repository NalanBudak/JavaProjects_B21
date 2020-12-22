package day41_Encapsulation;

public class Item {

    public String name;   // burasi  instance variable cunku her item name 'in unique olmasi lazim
    public int quantity;
    public double unitPrice;

    public Item(String name, int quantity, double unitPrice) {  //  constructor( object create etmek icin constructor kullanmmamiz lazim
        this.name = name;  // constructor instance e assign oluyor
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calcCost(){ // instance variable
        return quantity * unitPrice;
    }

    public String toString() {  // toString method===> used for print the object
        return "Item{" +
                "name ='" + name + '\'' +
                ", quantity = " + quantity +
                ", unitPrice = $" + unitPrice +
                ", total price= $" + calcCost()+
                '}';
    }


}

/*
create a class called Item
			instance variables=======>name, unitPrice, quantity
			                			add a constructor that can initialize the fields
			instance methods:

				calcCost(): returns the total cost as double
							hint: totalCost = quantity * unitPrice

				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */


