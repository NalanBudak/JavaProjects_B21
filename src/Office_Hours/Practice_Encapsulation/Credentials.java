package Office_Hours.Practice_Encapsulation;

public class Credentials {

    private String userName = "Cybertek";
    private String password = "Cybertek123";

     public String getUserName(){  // getter=== >   read only
        return userName;

   }
  public void setUserName(String userName) { // setter====>modify

    this.userName = userName;
}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

