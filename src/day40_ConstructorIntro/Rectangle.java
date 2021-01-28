package day40_ConstructorIntro;


public class Rectangle {

    public static int numberOfSides;             // static variable
    public double width, length, area, perimeter;// instance variables

    static {                 //  stattic variable set etmek icin static block kullandik.  NOT===> static asla static'ten baskasini accept etmez.instance kabul eder
        numberOfSides = 4;
    }

    public Rectangle(double width, double length) {  // instance variable'i  set etmek icin constructor olusturduk.  shorcut ===> generate==> constructor
        this.width = width;
        this.length = length;
        area = width * length;  // this kullnmadik cunku local variables dont share same name
        perimeter = (width + length) * 2;
    }


    public String toString() {  //  toString()    print etmek icin kullaniyoruz .shortcut==> generate==> toString()
        return "Rectangle{" +
                "width= " + width +
                ", length= " + length +
                ", area= " + area +
                ", perimeter= " + perimeter +
                ", Number of sides= " + numberOfSides +
                '}';
    }
}
//=============================================================================

    class RectangleObjects {   // burada yeni object create ediyoruz .

     public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5);
        Rectangle rectangle2 = new Rectangle(10, 20);
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        //    System.out.println( rectangle1.numberOfSides );
        //    System.out.println( rectangle2.numberOfSides );

        System.out.println(Rectangle.numberOfSides);

    }


}
