package day44_Inheritance.WebDriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver(String name, String version) {
        super(name, version); // super keyword prent class'tan geliyor

   }
// override'daki super keyword u sildik cunku super represent super class. bu ise yeni class. eski implementation'lari istemedigimiz icin sildik

    @Override   // shortcut override method===> right click, generate, override
    public void get(String URL){
        System.out.println("opening "+URL+" from the Remote driver");
    }

    public void close(){
        System.out.println("closing the Remote driver ");
    }

    public void maximize(){
        System.out.println("Maximizing the Remote driver");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}

/*
1. create a class called RemoteWebDriver
			name, version
			add a constructor to set the instances
			get(URL), maximize(), close()
 */
