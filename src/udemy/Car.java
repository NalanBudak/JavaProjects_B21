package udemy;

public class Car {

    // Fields ; Properties

    public String color;  // burayi public yaparsak her taraftan erisebiliriz
    public String model;  // eger private dersek sadece kendi class'indan ulasabiliriz.
    public double engine;
    public int doors;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }




    public int getDoors() {
        return this.doors;
    }
}
