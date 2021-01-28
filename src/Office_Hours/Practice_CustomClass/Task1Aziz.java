package Office_Hours.Practice_CustomClass;

public class Task1Aziz {

    // Laptop practice

    public String brand, model, color;
    public int modelYear;
    public double price;

    public void setInfo(String brand, String model, String color, int modelYear, int price) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.modelYear = modelYear;
        this.price = price;


    }

    public void getInfo() {
        System.out.println("Brand: " + brand +
                "\nModel: " + model +
                "\nColor: " + color +
                "\nYear: " + modelYear +
                "\nPrice: " + price);
    }

}
