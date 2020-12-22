package day35_CustomClass;

public class Car {
   /* instance variable: object variables each object has it's own copy of instance variables
                        declared outside the methods
      instance methods: object methods  does not have static
    ====================================================================*/

    public String brand;  //  Bu kisim  ===>instance variables
    public String model;
    public String color;
    public int year;
    public double price;



    // Bu kisim===> Instance methods
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand =  carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+" "+color+" $"+price);
    }

}
/*
Car class:
		Attributes: instance variables
			brand, model, color, price, year....
		actions: instance methods
			driver(), stop()....
 */
