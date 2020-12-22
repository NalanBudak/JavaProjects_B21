package day40_ConstructorIntro;

public class Circle {

    public static double PI;   // burasi static variable. public mandatory degildir. static variable, static block la kullanilir

    static{                    // burasi static block
        PI = 3.14;
    }

    public double r, d, area, perimeter; // burasi instance variable

    public Circle(double r){      // burasi constructor. class name ile constructor ayni olmak zorunda
        this.r = r;
        d = r * 2;
        area = r * r * PI;
        perimeter =d * PI;
    }
}
    /*  Circle
		variables:
				radius, PI, diameter, area, perimeter
		add a constructor to initialize the instances
 */

class CircleObjects{  //

    public static void main(String[] args) { // main method
        Circle circle1 = new Circle(5);

        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);

        Circle circle2 = new Circle(10);



    }

}



