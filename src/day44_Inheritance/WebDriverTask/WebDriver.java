package day44_Inheritance.WebDriverTask;

public class WebDriver {


    public String name, version;        // instance variables

    public WebDriver(String name, String version) {  //shortcut==> generate, constructor
        this.name = name;
        this.version = version;
    }

    public void get(String URL){ //  void method kullandik cunku hicbirsey return yapmayacagiz.
        System.out.println("opening "+URL+" from the Remote driver");
    }

    public void close(){
        System.out.println("closing the Remote driver ");
    }

    public void maximize(){
        System.out.println("Maximizing the Remote driver");
    }

    @Override   // shortcut kullan==> rigt click, generate, toString method
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










/*
1. create a class called RemoteWebDriver
			name, version
			add a constructor to set the instances
			get(URL), maximize(), close()
 */