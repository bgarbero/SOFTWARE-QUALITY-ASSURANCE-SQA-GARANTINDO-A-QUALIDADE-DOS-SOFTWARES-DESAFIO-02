package br.edu.desafio02;

import static org.junit.Assert.assertTrue;

import java.security.Key;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest{
    @Test
    public void testaLoginEmailCertoSemSenha(){
        
        WebElement campoEmail = driver.findElement(By.id("email"));
        campoEmail.sendKeys("admin@admin.com " + Keys.ENTER);
        //driver.quit();
        //assertTrue( true );
    }

    @Test
    public void testaLoginEmailCertoSenhaCerta(){

        WebElement campoEmail = driver.findElement(By.id("email"));
        campoEmail.sendKeys("admin@admin.com ");
        WebElement campoSenha = driver.findElement(By.id("senha"));
        campoSenha.sendKeys("admin@123" + Keys.ENTER);
    }

    @Test
    public void testaLoginCamposEmBranco(){

        WebElement botaoEntrar = driver.findElement(By.id("btn-entrar"));
        botaoEntrar.click();
    }

    @Test
    public void testaLoginComCredenciaisIncorretas(){
        
    }
}
