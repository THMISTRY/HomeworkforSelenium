package homeworkwebdriverconcept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromewebdriver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
//        find the element for register page to click on it
        driver.findElement(By.className("ico-register")).click();
//        to select female option in gender
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();
//        to enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Deepti");
//        to enter last name
        driver.findElement(By.id("LastName")).sendKeys("Sawant");
//        to select day of birthdate
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).click();
//        to select month of birthdate
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).click();
////        to select year of birthdate
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).click();
//        to enter the email address
        driver.findElement(By.id("Email")).sendKeys("sawant_deepti@yahoo.com");
//        to enter company name
        driver.findElement(By.id("Company")).sendKeys("Sawant & Company");
//        to tick the newsletter box
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
//        to enter password
        driver.findElement(By.id("Password")).sendKeys("India123");
//        to enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("India123");
//        to click on register button
        driver.findElement(By.id("register-button")).click();
//        Close the browser
        driver.quit();

        }


    }