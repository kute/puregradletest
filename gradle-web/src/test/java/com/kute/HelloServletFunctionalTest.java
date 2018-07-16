package com.kute;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * created by kute on 2018/07/16 16:28
 */
public class HelloServletFunctionalTest {
//    private WebDriver driver;
//
//    @BeforeClass
//    public static void setupClass() {
//        ChromeDriverManager.getInstance().setup();
//    }
//
//    @Before
//    public void setUp() {
//        driver = new ChromeDriver();
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null)
//            driver.quit();
//    }

    @Test
    public void sayHello() throws Exception {
//        driver.get("http://localhost:8080/gradle-web");
//
//        driver.findElement(By.id("say-hello-text-input")).sendKeys("Dolly");
//        driver.findElement(By.id("say-hello-button")).click();
//
//        System.out.println("kute=======");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.findElement(By.tagName("h2")).getText());
//        assertEquals("Hello Page", driver.getTitle());
//        assertEquals("Hello, Dolly!", driver.findElement(By.tagName("h2")).getText());
    }
}
