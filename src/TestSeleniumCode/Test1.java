package TestSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
    String FirstName="FirstTest";
    WebDriver driver;
        //String driverPath="C:/Users/tiranis/IdeaProjects/first/src/lib/chromedriver.exe/";
        //System.setProperty("webdriver.chrome.driver", "C:/Users/tiranis/IdeaProjects/first/src/lib/chromedriver.exe/");
        // System.setProperty("webdriver.chrome.driver", "./src/libs/libs/chromedriver.exe/");

    @BeforeTest
    public void Login() {
        System.setProperty("webdriver.chrome.driver", "./src/libs/libs/chromedriver.exe/");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }

    @Test
    public void Register(String FirstName) {

        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        driver.findElement(By.name("firstName")).sendKeys(FirstName);
        driver.findElement(By.name("lastName")).sendKeys("Test");
        driver.findElement(By.name("phone")).sendKeys("0760883981");
        driver.findElement(By.name("userName")).sendKeys("tiranisathsarani@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("327/2A,Palanwaththa,Pannipitiya.");
        driver.findElement(By.name("city")).sendKeys("Pannipitiya");
        driver.findElement(By.name("state")).sendKeys("Western");
        driver.findElement(By.name("postalCode")).sendKeys("10420");
        driver.findElement(By.name("country")).sendKeys("SRI LANKA");
        driver.findElement(By.name("email")).sendKeys("TestOne");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement(By.name("confirmPassword")).sendKeys("test123");
        driver.findElement(By.name("submit")).click();

        String ExpectedTest = "Note: Your user name is TestOne.";
        String ActualTest = driver.findElement(By.xpath("//a[@href='login.php']/following::b[1]")).getText();
        Assert.assertEquals(ExpectedTest, ActualTest);


    }

    @AfterTest
    public void Close(){
        driver.close();
    }

}
