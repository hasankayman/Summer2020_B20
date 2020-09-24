package day51_Exceptions.BrowserTask;

public class OperaBrowser extends Webdriver{

    @Override
    public void get(String url) {
        System.out.println("Opening the " + url + " in the Opera");
    }

    @Override
    public void close() {
        System.out.println("Opera is closing");
    }
}
