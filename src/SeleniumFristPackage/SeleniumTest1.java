package SeleniumFristPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class SeleniumTest1 {
        public static void main(String[] args) {
            WebDriver driver;
            // System.setProperty("webdriver.chrome.driver", "C:/Users/tiranis/IdeaProjects/first/src/lib/chromedriver.exe/");
            System.setProperty("webdriver.chrome.driver", "./src/libs/libs/chromedriver.exe/");
            driver=new ChromeDriver();
            driver.get("http://demo.guru99.com/test/newtours/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
            driver.findElement(By.name("firstName")).sendKeys("First");
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

            String et = "Note: Your user name is TestOne";
            String at = driver.findElement(By.xpath("//a[@href='login.php']/following::b[1]")).getText();
            if(at.contains(et)){
                System.out.println("Pass");
            }
            else{
                System.out.println("Fail");
            }
            driver.close();

        }
    }

