package day45_Exceptions.PhoneTask;


public class Device  {  // super class or parennt class

    public String brand, model;  // instance variables because we need more than one copy that is why we did not use static variable.
    public String country;
    public double price;


     public Device(String brand, String model, String country, double price){ //constructor. shortcut kullan generate, construcor
            this.country = country;
            this.brand = brand;
            this.model = model;
            this.price = price;

        }

    @Override    //  toString print etmek icin
    public String toString() {
        return "{" +     // burdan device 'i sildik cunku diger subclass larin isimleri farkli oldugundan. subclasslara class in adini manual yazdik. return' un yanina
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", country= '" + country + '\'' +
                ", price= $" + price +
                '}';
    }

}

/*
create a class called device:
				attributes: brand, model, price, country
				methods: toString
 */


