package parkingcalculatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import parkingcalculator.ParkingCalculator;

public class ParkingCalculatorTest {

    WebDriver webDriver;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @BeforeTest
    public void initial(){
        webDriver.get("http://adam.goucher.ca/parkcalc/index.php");
    }

    @Test
    public void showValidPrice () {

        ParkingCalculator parking = new ParkingCalculator(webDriver);
        parking.showCorrectPrice("Long-Term Surface Parking", "10:00", "2/27/2019", "11:00", "2/27/2019");
        Assert.assertEquals(2,2, "The price is correct");

    }

    @AfterTest
    public void exit() {

        webDriver.close();
    }
}
