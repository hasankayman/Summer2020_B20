package day51_Exceptions.BrowserTask;

/*
 2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser

* */
public class ChromeBrowser extends Webdriver {

    public void get(String url) {
        System.out.println("Opening the " + url + " in the Google Chrome");
    }

    @Override
    public void close() {
        System.out.println("Google Chrome is closing.");
    }
}
