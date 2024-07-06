package br.edu.desafio02.test;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver driver;
    protected static final String URL_LOGIN = "file:///D:/GitHub/SOFTWARE-QUALITY-ASSURANCE-SQA-GARANTINDO-A-QUALIDADE-DOS-SOFTWARES-DESAFIO-02/controle-de-produtos/sistema/login.html ";
    protected static final String URL_CRUD = "file:///D:/GitHub/SOFTWARE-QUALITY-ASSURANCE-SQA-GARANTINDO-A-QUALIDADE-DOS-SOFTWARES-DESAFIO-02/controle-de-produtos/sistema/produtos.html?teste=123";
    protected static final String CAMINHO_DRIVER = "D:\\GitHub\\SOFTWARE-QUALITY-ASSURANCE-SQA-GARANTINDO-A-QUALIDADE-DOS-SOFTWARES-DESAFIO-02\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

    @BeforeClass
    public static void inciarNavegador() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @AfterClass
//     public static void finalizarNavegador(){
//         driver.quit();
//     }
}
