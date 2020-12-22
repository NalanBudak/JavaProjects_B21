package day40_ConstructorIntro;

public class Car {

    public String brand, model, color;  // instance variables
    public int year;
    public double price;

    public Car(String brand) {  // constructor
        this.brand = brand;
    }

    public Car(String brand, String model) {  //
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this(brand, model, year);
        this.price = price;
    }

    public Car(String brand, String model, String color, int year, double price) {
        this(brand, model, year, price);
        this.color = color;
    }



}

/*
2. class name: Car
			instance variables:
					brand, model, year, price, color
			1st constructor: initialize the brand of the car
			2nd constructor: initialize the brand and model of the car
							(MUST apply constructor Call)
			3rd constructor: initialize the brand, model, year of the car
							(MUST apply constructor Call)
			4th constructor: initialize the brand, model, year, pric of the car
							(MUST apply constructor Call)
			5th Constructor: initialize all isntances of the car
							(MUST apply constructor Call)
			Instance methods:
				toString()
 */









