package day49_Abstraction_Review.RemoteDriverTask;

public interface WebDriver {

    void get(String URL);
    void close();
    void quit();


}