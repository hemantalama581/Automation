package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login {

    public static void performLogin(WebDriver driver) {
        driver.get("https://quantum.billboardplanet.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Enter username
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));
        usernameField.sendKeys("acmeqa");

        // Enter password
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
        passwordField.sendKeys("stage@BBP20");

        // Click login button
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton")));
        loginButton.click();

    }
}
