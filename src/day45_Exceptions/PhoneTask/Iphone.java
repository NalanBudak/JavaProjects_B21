package day45_Exceptions.PhoneTask;

public final class Iphone extends Phone { // hata verecek cunku constructor create etmemn gerek

    public Iphone(String model, double price) {  // shorcut kullan.
        super("Iphone", model, "USA", price);// super- instance'leri set emek icin kullaniyoruz super class'tan cagiriyoruz.
    }

    public void faceTime(long number){
        System.out.println(brand+" "+ model +" is face timing with "+number);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+ model +" is face timing with "+email);
    }

    public void faceTime(long number1, long number2){
        faceTime(number1);
        faceTime(number2);
    }

    public void faceTime(long number1, long number2, long number3){
        faceTime(number1, number2);
        faceTime(number3);
    }

    public void faceTime(String email1, String email2){
        faceTime(email1);
        faceTime(email2);
    }

    public void faceTime(String email1, String email2, String email3){
        faceTime(email1, email2);
        faceTime(email3);
    }


}
