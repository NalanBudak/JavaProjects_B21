package Office_Hours.Practice_CustomClass;

public class Task1LaptopMarket {

    public static void main(String[] args) {

        Task1Aziz laptop1 = new Task1Aziz();
        laptop1.setInfo("Apple", "MacbookPro", "Grey", 2020, 2500);

        laptop1.getInfo();

        System.out.println("=============================");

        Task1Aziz laptop2 = new Task1Aziz();
        laptop2.setInfo("Asus", "Rog", "Black", 2020, 3500);
        laptop2.getInfo();

        System.out.println("===============================");

        Task1Aziz laptop3 = new Task1Aziz();
        laptop3.setInfo("Lg", "xl", "White", 2021, 4500);
        laptop3.getInfo();

    }


}
