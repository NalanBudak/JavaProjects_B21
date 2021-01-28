package Office_Hours.Practice_Constructor;

public class CircleObjects {

    /* circle1 :   r=3   d=6   PI=3.14      area=30
       circle2:    r=5   d=10  PI=3.14      area=80
       circle3:    r=6   d=12  PI=3.14      area=100

     */

    public static void main(String[] args) {

        Circle circle1= new Circle(3);

        System.out.println("Circle1' radius : " + circle1.radius);  //3.0
        System.out.println("Circle1'diameter :" + circle1.diameter);//6.0

        System.out.println("Circle1'area: "+ circle1.calculateArea());
        System.out.println("Circle1'area:"+ circle1.area);
        System.out.println("Circle1' Perimeter: "+ circle1.calculatePerimeter());
        System.out.println("Circle'Perimeter: "+ circle1.perimeter);

        System.out.println("========================================================");

        Circle circle2 = new Circle(5);
        System.out.println("Circle2' radius: "+ circle2.radius);
        System.out.println("Circle2'diameter: "+ circle2.diameter);
        System.out.println("Circle2'area: "+ circle2.area);
        System.out.println("Circle2'perimeter: " + circle2.perimeter);

        System.out.println("========================================================");

        Circle circle3 = new Circle(6);
        System.out.println("Circle3' radius: "+ circle3.radius);
        System.out.println("Circle3'diameter: "+ circle3.diameter);
        System.out.println("Circle3'area: "+ circle3.area);
        System.out.println("Circle3'perimeter: " + circle3.perimeter);

        System.out.println("========================================================");

        //find the area circle that has radius of 10

        System.out.println("Area: " + new Circle(10).area);
        System.out.println("Perimeter: "+ new Circle(30).perimeter);

        System.out.println("========================================================");

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

    }
}
