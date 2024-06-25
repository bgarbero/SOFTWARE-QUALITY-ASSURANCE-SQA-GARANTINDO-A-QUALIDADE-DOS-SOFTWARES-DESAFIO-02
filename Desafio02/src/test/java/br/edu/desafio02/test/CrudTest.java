package br.edu.desafio02.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

import br.edu.desafio02.page.CrudPage;
import br.edu.desafio02.page.LoginPage;

public class CrudTest extends BaseTest{
    private static CrudPage crud;
    private static LoginPage login;

    @BeforeClass
    public static void login(){
        login = new LoginPage(driver);
        driver.get(URL_BASE);
        login.campoEmail.sendKeys("admin@admin.com ");
        login.campoSenha.sendKeys("admin@123" + Keys.ENTER);
    }

    @BeforeClass
    public static void preparaAmbienteParaTestes(){
        crud = new CrudPage(driver);
    }

    
    @Test
    public void TC001_testaCadastrarProdutoCodigoEmBranco(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("1");
        crud.valor.sendKeys("100,00");
        crud.data.sendKeys("25/06/2024");
        crud.botaoSalvar.click();
    }

    @Test
    public void TC002_testaCadastrarProdutosComLetrasNoCampoQuantidade(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.codigo.sendKeys("001");
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("ABC");
        crud.valor.sendKeys("100,00");
        crud.data.sendKeys("25/06/2024");
        crud.botaoSalvar.click();
        crud.botaoSair.click();
    }

    @Test
    public void TC002_testaCadastrarProdutosComLetrasNoCampoValor(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.codigo.sendKeys("001");
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("1");
        crud.valor.sendKeys("ABC");
        crud.data.sendKeys("25/06/2024");
        crud.botaoSalvar.click();
        crud.botaoSair.click();
    }

    @Test
    public void TC002_testaCadastrarProdutosComCamposEmBranco(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.botaoSalvar.click();
    }

    @Test
    public void TC002_testaCampoData(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.codigo.sendKeys("001");
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("1");
        crud.valor.sendKeys("100,00");
        crud.data.sendKeys("25/06/1908");
        crud.botaoSalvar.click();
        crud.botaoSair.click();
    }
    
}
