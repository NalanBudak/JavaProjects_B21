package day44_Inheritance.ShapesTask;


public class Square extends Shape {

    /*
     variables: 4 ( 1 ins, 3 sta)
     methods: 4 (4 ins)
  */
    public double side;

    public Square(double side) {
        this.side = side;
        setInfo("Square");
    }

}