package com.sergio.healthtrack;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumPesoTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    void buscarPesoSaludableEnGoogle() throws InterruptedException {
        driver.get("https://duckduckgo.com/");

        WebElement inputBusqueda = driver.findElement(By.name("q"));
        inputBusqueda.sendKeys("peso saludable");
        inputBusqueda.submit();

        Thread.sleep(2000);

        String titulo = driver.getTitle();
        assertTrue(titulo.toLowerCase().contains("peso saludable"));
    }
}