package day38_Statics;

public class Iphone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple" , OS = "iOS" , madeIn = "China" ;

    public void call(long phoneNumber){
        System.out.println("Iphone "+model+" is calling "+phoneNumber);
    }

    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+OS);
        System.out.println("Made in: "+madeIn);
    }

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", Color: "+color+", price: "+price+", Operating System: "+OS;
    }

  //  toString methods: gets executed automatically when you pass the object in print statement

    // static   = dogrudan class dan cagiriyoruz
    // instance = dogrudan objec ten cagiriyoruz

}

/*
iphone:
	attributes:
			instance: model, color, price, storage
			static: brand, operating system, madeIn, deignated
 */


