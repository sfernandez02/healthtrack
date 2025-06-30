package com.sergio.healthtrack;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumPesoTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();     }


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