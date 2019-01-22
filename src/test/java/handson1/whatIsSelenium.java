package handson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class whatIsSelenium {
    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        driver = initializeDriver();
        enterUrl();
    }

    private static WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver","D://Setup//chromedriver//chromedriver.exe");
        return new ChromeDriver();
    }

    private static void enterUrl() throws InterruptedException {
        driver.get("http:google.com");
        Thread.sleep(2000);
    }

}
