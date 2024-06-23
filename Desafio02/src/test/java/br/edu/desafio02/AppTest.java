package br.edu.desafio02;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
    private String caminhoChromeDriver = "C:\\Users\\Bruno\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
    @Test
    public void testaLoginCamposEmBranco()
    {
        System.setProperty("webdriver.chrome.driver", caminhoChromeDriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Bruno/Desktop/qa/controle-de-produtos/sistema/login.html");

        //driver.quit();



        //assertTrue( true );
    }
}
