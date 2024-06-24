package homeworkwebconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {

//  1. Set up the Chromedriver
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
//  2. Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//  3. Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
//  4. Get Page Title
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is: "+PageTitle);
//  5. Navigation Back
        driver.navigate().back();
//  6. Navigation Forward
        driver.navigate().forward();
//  7. Refresh the Page
        driver.navigate().refresh();
//  8. Maximize the window
        driver.manage().window().maximize();
//  9. Get Current URL
        System.out.println("Current URL is: " +driver.getCurrentUrl());
//  10. Close the browser (For current screen close, for all screen close quit)
        driver.close();
        driver.quit();

    }
    }

