package Office_Hours.Practice_Constructor;

public class Circle {

    public double radius;     // instance variable
    public double diameter;
    public static double PI;  // static variable

    public double area;
    public double perimeter;

    static { // static block only runs one time and first run
        PI = 3.14;
    }

    public Circle(double radius) {     // constructor MUST be same  with the class name
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea() {
        return radius * radius * PI;

    }

    public double calculatePerimeter() {

        return diameter * PI;

    }

    public String toString() { //  we use toString method because printing object of the circle
        return "Radius :" + radius + " , Diameter: " + diameter + ", Area: " + area + "Perimeter : " + perimeter;
    }

}






