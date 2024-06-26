package br.edu.desafio02.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrudPage extends BasePage{

    @FindBy(id = "email")
    public WebElement campoEmail;
    @FindBy(id = "senha")
    public WebElement campoSenha;
    @FindBy(id = "btn-entrar")
    public WebElement botaoEntrar;
    @FindBy(id = "btn-adicionar")
    public WebElement botaoCriar;
    @FindBy(id = "codigo")
    public WebElement codigo;
    @FindBy(id = "nome")
    public WebElement nome;
    @FindBy(id = "quantidade")
    public WebElement quantidade;
    @FindBy(id = "valor")
    public WebElement valor;
    @FindBy(id = "data")
    public WebElement data;
    @FindBy(id = "btn-salvar")
    public WebElement botaoSalvar;
    @FindBy(id = "btn-sair")
    public WebElement botaoSair;
    @FindBy(css = "body > div > div:nth-child(2) > table > tbody > tr > td:nth-child(6) > button:nth-child(2)")
    public WebElement botaoExcluir;
    @FindBy(css = "body > div > div:nth-child(2) > table > tbody > tr > td:nth-child(6) > button:nth-child(1)")
    public WebElement botaoEditar;
    @FindBy(css = "#collapsibleNavbar > ul > li > a")
    public WebElement botaoVoltar;



    public CrudPage(WebDriver driver) {
        super(driver);
    }
    
}
