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

        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        // ✅ Evita conflictos de sesiones paralelas en Linux/CI
        String profilePath = "/tmp/chrome-profile-" + System.currentTimeMillis();
        options.addArguments("--user-data-dir=" + profilePath);

        driver = new ChromeDriver(options);



    }


    @Test
    void buscarPesoSaludableEnGoogle() throws InterruptedException {
        driver.get("https://duckduckgo.com/");

        WebElement inputBusqueda = driver.findElement(By.name("q"));
        inputBusqueda.sendKeys("peso saludable");
        inputBusqueda.submit();

        Thread.sleep(2000); // Esperamos carga de resultados

        String titulo = driver.getTitle();
        assertTrue(titulo.toLowerCase().contains("peso saludable"));
    }
}