package Office_Hours.Practice_CustomClass;

public class Araba {

    public String marka, model, renk;
    public int year, kapiSayisi;
    public double price, engine;

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngine(double engine) {
        this.engine = engine;


    }
public void getInfo(){
    System.out.println(" Marka: " +marka+ " Model: " +model + " Renk: "+ renk +" Year: " + year +" Kapi sayisi: "+ kapiSayisi+ " Price: "+ price + " Engine: "+ engine);

}
}