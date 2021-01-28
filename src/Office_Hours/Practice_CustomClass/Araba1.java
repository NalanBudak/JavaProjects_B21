package Office_Hours.Practice_CustomClass;

public class Araba1 {

    public static void main(String[] args) {

        Araba yeni = new Araba();

        yeni.setMarka("Tesla");
        yeni.setModel("X");
        yeni.setRenk("Blue");
        yeni.setYear(2021);
        yeni.setKapiSayisi(4);
        yeni.setPrice(50000);
        yeni.setEngine(2.5);

        yeni.getInfo();

        yeni.setRenk("Black");
        yeni.setPrice(40000);

        yeni.getInfo();
    }

}
