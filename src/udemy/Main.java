package udemy;

public class Main {

    public static void main(String[] args) {

        // Fields
        //Methods

        Car car1= new Car(); // bir tane obje olusturduk bu yontemle
        car1.color ="Silver";
        car1.model ="GMC Acadia";
        car1.engine =3.6;
        car1.doors=4;

        System.out.println("Arabanin rengi : "+ car1.getColor());
        System.out.println("Arabanin modeli: "+ car1.getModel());
        System.out.println("Arabanin Motor Hacmi : "+ car1.engine);
        System.out.println("Arabanin kapi sayisi : "+ car1.getDoors());



    }
}
