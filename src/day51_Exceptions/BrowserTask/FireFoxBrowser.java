package day51_Exceptions.BrowserTask;

public class FireFoxBrowser extends Webdriver{

    public void get(String url) {
        System.out.println("Opening the " + url + " in the Firefox");
    }


    public void close() {
        System.out.println("Firefox is closing.");
    }
}
