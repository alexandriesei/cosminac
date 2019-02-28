package parkingcalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://adam.goucher.ca/parkcalc/index.php");

        ParkingCalculator parking = new ParkingCalculator(driver);

    }
}
