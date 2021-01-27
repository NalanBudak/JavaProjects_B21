package day47_Abstraction.ShapeTasks;

public abstract class Shape {  // not concrete (not physically exist)(shape somut degildir)


    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area(); // "what it is " matters, " how it's done" does not matter
    public abstract double perimeter();


}


