package aula.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroTest {

	WebDriver driver;

	@Given("que esteja no formulario de conta")
	public void que_esteja_no_formulario_de_conta() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://next.me/conta-next");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("preencher os dados obrigatorios")
	public void preencher_os_dados_obrigatorios() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[4]/button/div/span")).click();
		driver.findElement(By.id("namefalse")).sendKeys("Monica Lima");
		driver.findElement(By.id("cpffalse")).sendKeys("070.197.580-61");
		driver.findElement(By.id("emailfalse")).sendKeys("teste@teste.com.br");
		driver.findElement(By.id("email_confirmfalse")).sendKeys("teste@teste.com.br");
		driver.findElement(By.xpath("//*[@id=\"drawer-form\"]/div/form/button")).click();
	}

	@When("preencher os dados obrigatorios invalidos")
	public void preencher_os_dados_obrigatorios_invalidos() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[4]/button/div/span")).click();
		driver.findElement(By.id("namefalse")).sendKeys("1515121515");
		driver.findElement(By.id("cpffalse")).sendKeys("000.000.000-00");
		driver.findElement(By.id("emailfalse")).sendKeys("testetestecombr");
		driver.findElement(By.id("email_confirmfalse")).sendKeys("testetestecombr");
		driver.findElement(By.xpath("//*[@id=\"drawer-form\"]/div/form/button")).click();
	}

	@Then("enviado com sucesso")
	public void enviado_com_sucesso() {
		driver.quit();
	}

	@Then("apresenta indicacoes de erro no preenchimento")
	public void apresenta_indicacoes_de_erro_no_preenchimento() {
		driver.quit();
	}

	@Given("preencher emails diferentes")
	public void preencher_emails_diferentes() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[4]/button/div/span")).click();
		driver.findElement(By.id("namefalse")).sendKeys("Monica Lima");
		driver.findElement(By.id("cpffalse")).sendKeys("070.197.580-61");
		driver.findElement(By.id("emailfalse")).sendKeys("teste@teste.com.br");
		driver.findElement(By.id("email_confirmfalse")).sendKeys("teste@tudo.com.br");
		driver.findElement(By.xpath("//*[@id=\"drawer-form\"]/div/form/button")).click();
	}

	@When("nao preencher os dados obrigatorios")
	public void nao_preencher_os_dados_obrigatorios() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[4]/button/div/span")).click();
		driver.findElement(By.id("namefalse")).sendKeys("");
		driver.findElement(By.id("cpffalse")).sendKeys("");
		driver.findElement(By.id("emailfalse")).sendKeys("");
		driver.findElement(By.id("email_confirmfalse")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"drawer-form\"]/div/form/button")).click();
	}

	@When("informar o nome {string}")
	public void informar_o_nome(String nome) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div/div[4]/button/div/span")).click();
		driver.findElement(By.id("namefalse")).sendKeys(nome);
	}

	@When("o cpf {string}")
	public void o_cpf(String cpf) {
		driver.findElement(By.id("cpffalse")).sendKeys(cpf);
	}

	@When("o email {string}")
	public void o_email(String email) {
		driver.findElement(By.id("emailfalse")).sendKeys(email);
	}

	@When("confirmar o email {string}")
	public void confirmar_o_email(String confirmaremail) {
		driver.findElement(By.id("email_confirmfalse")).sendKeys(confirmaremail);
	}

	@Then("enviado com sucesso true")
	public void enviado_com_sucesso_true() {
		driver.findElement(By.xpath("//*[@id=\"drawer-form\"]/div/form/button")).click();
		driver.quit();
	}

	@Then("enviado com sucesso false")
	public void enviado_com_sucesso_false() {
		driver.findElement(By.xpath("//*[@id=\"drawer-form\"]/div/form/button")).click();
		driver.quit();
	}
}