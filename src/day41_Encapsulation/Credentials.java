package day41_Encapsulation;

public class Credentials {
    /*  Getter(Read ONLY): public instance method. return method, does not pass any parameter
                            returnType MUST match with filed (instance)


    	Setter(Write ONLY): public instance method. returns "nothing" returnType is void.
    		                passes a parameter (MUST match with instance variable)
							final variables cannot have setter
                            */
    private String userName = "cybertek";
    private double passWord = 1234;

    public String getUserName() {
        return userName;
    }

    public double getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        /*
        if(userName.length() < 8){
            return;
        }
                we can also do security check in setter of Encapsulation
         */
        this.userName = userName;
    }

    public void setPassWord(double passWord){
        this.passWord = passWord;
    }


}


