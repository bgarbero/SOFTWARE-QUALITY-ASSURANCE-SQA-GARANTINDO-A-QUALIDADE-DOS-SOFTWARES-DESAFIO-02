package br.edu.desafio02.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement campoEmail;
    @FindBy(id = "senha")
    public WebElement campoSenha;
    @FindBy(id = "btn-entrar")
    public WebElement botaoEntrar;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
