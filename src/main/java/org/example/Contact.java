package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Contact {
    public static void main(String [] args)
    {
        WebDriver driver = new ChromeDriver();
        Login.performLogin(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement crmButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-menu-content\"]/div/div/div[1]/ul/li[5]/menu-toggle/button")));
        crmButton.click();
        WebElement contact = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"docs-menu-CRM\"]/li[2]/menu-link/a")));
        contact.click();
        WebElement newContactButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/div/md-content/div[2]/button[1]/span")));
        newContactButton.click();

    }
}
