package br.edu.desafio02.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import br.edu.desafio02.page.LoginPage;

public class LoginTest extends BaseTest{
    private static LoginPage login;

    @BeforeClass
    public static void preparaAmbienteParaTestes(){
        login = new LoginPage(driver);
    }

    @Test
    public void TC001_testaLoginCamposEmBranco(){
        driver.get(URL_LOGIN);
        login.botaoEntrar.click();
    }

    @Test
    public void TC002_testaLoginComCredenciaisIncorretas(){
        driver.get(URL_LOGIN);
        login.campoEmail.sendKeys("batatinha@gmail.com");
        login.campoSenha.sendKeys("batatinha" + Keys.ENTER);
    }

    @Test
    public void TC003_testaLoginEmailCertoSemSenha(){
        driver.get(URL_LOGIN);
        login.campoEmail.sendKeys("admin@admin.com " + Keys.ENTER);
    }

    @Test
    public void TC004_testaLoginEmailCertoSenhaCerta(){
        driver.get(URL_LOGIN);
        login.campoEmail.sendKeys("admin@admin.com ");
        login.campoSenha.sendKeys("admin@123" + Keys.ENTER);
    }
}
