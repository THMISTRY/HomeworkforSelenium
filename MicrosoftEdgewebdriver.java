package homeworkwebdriverconcept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgewebdriver {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
//        click on register
        driver.findElement(By.className("ico-register")).click();
//      click on female
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/label")).click();
//      Enter First Name
        driver.findElement(By.id("FirstName")).sendKeys("Nina");
//      Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Sharma");
//        Enter day in date of birth
        driver.findElement(By.className("valid")).click();
//        Enter month in date of birth
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).click();
//        Enter year in date of birth
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).click();
//        Enter email id
        driver.findElement(By.id("Email")).sendKeys("nsharma@yahoo.com");
//        Enter company name
        driver.findElement(By.id("Company")).sendKeys("Sharma & Company");
//        Select for Newsletter
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
//        Enter password
        driver.findElement(By.id("Password")).sendKeys("India123");
//        Enter confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("India123");
//        Click on register
        driver.findElement(By.id("register-button")).click();
    }
}
