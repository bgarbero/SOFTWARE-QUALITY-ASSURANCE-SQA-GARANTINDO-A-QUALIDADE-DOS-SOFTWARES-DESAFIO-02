package br.edu.desafio02.test;

import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.desafio02.page.CrudPage;

public class CrudTest extends BaseTest{
    private static CrudPage crud;

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
    public void TC003_testaCadastrarProdutosComLetrasNoCampoValor(){
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
    public void TC004_testaCadastrarProdutosComLetrasNoCampoCodigo(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.codigo.sendKeys("ABC");
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("1");
        crud.valor.sendKeys("100,00");
        crud.data.sendKeys("25/06/2024");
        crud.botaoSalvar.click();
        crud.botaoSair.click();
    }

    @Test
    public void TC005_testaCadastrarProdutosComCamposEmBranco(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.botaoSalvar.click();
    }

    @Test
    public void TC006_testaCampoData(){
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

    @Test
    public void TC007_testaBotaoExcluir(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.codigo.sendKeys("001");
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("1");
        crud.valor.sendKeys("100,00");
        crud.data.sendKeys("26/06/2024");
        crud.botaoSalvar.click();
        crud.botaoSair.click();
        crud.botaoExcluir.click();
    }

    @Test
    public void TC008_testaBotaoEditar(){
        driver.get(URL_CRUD);
        crud.botaoCriar.click();
        crud.botaoCriar.click();
        crud.codigo.sendKeys("001");
        crud.nome.sendKeys("Celular");
        crud.quantidade.sendKeys("1");
        crud.valor.sendKeys("100,00");
        crud.data.sendKeys("26/06/2024");
        crud.botaoSalvar.click();
        crud.botaoSair.click();
        crud.botaoEditar.click();
    }

    @Test
    public void TC009_testaBotaoVoltar(){
        driver.get(URL_CRUD);
        crud.botaoVoltar.click();
    }
    
}
