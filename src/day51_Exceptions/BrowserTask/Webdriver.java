package day51_Exceptions.BrowserTask;

public class Webdriver {
    public void get (String url) {
        System.out.println("Opening the " + url + " in the default browser");
    }

    public void close() {
        System.out.println("Closing the default browser");
    }
}
