import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Tests extends Main {
    @Test
    public void registerAccount() {
        driver.get("https://accounts.google.com/SignUp");
        driver.findElement(By.id("firstName")).sendKeys("Ilja");
        driver.findElement(By.id("lastName")).sendKeys("Holmogortsev");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();

        driver.findElement(By.id("day")).sendKeys("6");

        WebElement dropdownElement  = driver.findElement(By.id("month"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("4");

        WebElement dropdownElementGender  = driver.findElement(By.id("gender"));
        Select dropdownGender = new Select(dropdownElementGender);
        dropdownGender.selectByValue("1");

        driver.findElement(By.id("year")).sendKeys("2003");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]")).click();
        driver.findElement(By.name("Username")).sendKeys("iljaholmogortsev200312345");

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[1]/div/div/button/span")).click();

        driver.findElement(By.name("Passwd")).sendKeys("Q2kP1CNSaMjo7dK");
        driver.findElement(By.name("PasswdAgain")).sendKeys("Q2kP1CNSaMjo7dK");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.className("VfPpkd-LgbsSe")));
        button.click();
    }
}
