package homeworkwebconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdge {
    public static void main(String[] args) {

//  1. Set up the Edgedriver
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
//  2. Create an instance of WebDriver
        WebDriver driver = new EdgeDriver();
//  3. Navigate to the webpage
        driver.get("https://demo.nopcommerce.com/");
//  4. Get Page Title
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is :"+PageTitle);
//  5. Navigate Back
        driver.navigate().back();
//  6. Navigate Forward
        driver.navigate().forward();
//  7. Refresh the page
        driver.navigate().refresh();
//  8. Maximize the window
        driver.manage().window().maximize();
//  9. Get Current URL
        System.out.println("Current URL is :" +driver.getCurrentUrl());
//  10. Close the browser (For current screen close, for all screen close quit)
        driver.close();
        driver.quit();
    }
}
