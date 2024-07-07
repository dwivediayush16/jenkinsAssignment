package Jenkins_Assignment.Jenkins_A;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayushdwivedi01\\eclipse-workspace\\Jenkins_A\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testAutomationSite() {
        driver.get("https://demo.automationtesting.in/Index.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.close();
           
        }
    }
}
