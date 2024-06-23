package br.edu.desafio02.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver driver;
    protected static final String URL_BASE = "file:///C:/Users/Bruno/Desktop/qa/controle-de-produtos/sistema/login.html";
    protected static final String CAMINHO_DRIVER = "C:\\Users\\Bruno\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

    @BeforeClass
    public static void inciarNavegador() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }

   // @AfterClass
    //public static void finalizarNavegador(){
        //driver.quit();
    //}
}
