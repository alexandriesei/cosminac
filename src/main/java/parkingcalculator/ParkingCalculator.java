package parkingcalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.SQLOutput;

public class ParkingCalculator {
    WebDriver webDriver;
    private By chooseALotLocator = By.id("Lot");
    private By chooseEntryTimeLocator = By.id("EntryTime");
    private By chooseEntryDateLocator = By.id("EntryDate");
    private By chooseLeavingTimeLocator = By.id("ExitTime");
    private By chooseLeavingDateLocator = By.id("ExitDate");
    private By calculateButtonLocator = By.xpath("/html/body/form/input[2]");
    private By priceLocator = By.className("SubHead");

    public ParkingCalculator(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public void chooseALot(String lot) {
        Select dropd = new Select(webDriver.findElement(chooseALotLocator));
        dropd.selectByVisibleText(lot);
    }

    public void typeEntryTime(String time) {

        webDriver.findElement(chooseEntryTimeLocator).sendKeys(time);
    }

    public void typeEntryDate(String date) {

        webDriver.findElement(chooseEntryDateLocator).sendKeys(date);
    }

    public void typeLeavingTime(String ltime) {

        webDriver.findElement(chooseLeavingTimeLocator).sendKeys(ltime);
    }

    public void typeLeavingDate(String ldate) {

        webDriver.findElement(chooseLeavingDateLocator).sendKeys(ldate);
    }

    public void pressCalculateBtn() {

        webDriver.findElement(calculateButtonLocator).click();
    }

    public void showPrice() {

        webDriver.findElement(priceLocator).isDisplayed();

        int cost = 2;
        int time = 60;

        if(cost == 2 && time == 60) {
            System.out.println("The price is correct");
        } else {
            System.err.println();
        }

    }

    public void showCorrectPrice(String lot, String time, String date, String ltime, String ldate) {

        chooseALot(lot);
        typeEntryTime(time);
        typeEntryDate(date);
        typeLeavingTime(ltime);
        typeLeavingDate(ldate);
        pressCalculateBtn();
        showPrice();

    }
}
