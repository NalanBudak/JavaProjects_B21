package day44_Inheritance.WebDriverTask;

public class CybertekDriver extends WebDriver {

    public CybertekDriver(){
        super("Cybertek Browser", "V75.0.1");
    }
//super key word 'leri sildik asagida. cunku  super kyword , super class dan geliyor, bu uise yeni class
    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from cybertek driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Cybertek Driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Cybertek Driver");
    }
}
