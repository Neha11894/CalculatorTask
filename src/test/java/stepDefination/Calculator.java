package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {

	

	WebDriver browser;
	@Given("user at calculator page")
	public void user_at_calculator_page() {
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		browser=new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		browser.get("https://www.calculator.net");
	    
	}
	
	
	@When("user click on Four number")
	public void user_click_on_Four_number() throws Exception {
	   browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
	   Thread.sleep(2000);
	}

	@When("user click on Two number")
	public void user_click_on_Two_number() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		Thread.sleep(2000);
	}

	@When("user click on Three number")
	public void user_click_on_Three_number() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		Thread.sleep(2000);
	    
	}

	@When("user click on Multiplication sign")
	public void user_click_on_Multiplication_sign() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
		Thread.sleep(2000);
	    	}
	
	@When("user click on Five number")
	public void user_click_on_Five_number() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		Thread.sleep(2000);
	    
	}

	@Then("user click on Equalto Sign")
	public void user_click_on_Equalto_Sign() {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		browser.close();
	   	}
	
	@When("user click on Zero number")
	public void user_click_on_Zero_number() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		Thread.sleep(2000);
	    	}

	@When("user click on Division sign")
	public void user_click_on_Division_sign() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
		Thread.sleep(2000);
	   	}
	
	@When("user click on minus sign")
	public void user_click_on_minus_sign() throws Exception{
	    browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
	    Thread.sleep(2000);
	}

	@When("user click on Addition sign")
	public void user_click_on_Addition_sign() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
	    Thread.sleep(2000);

	    	}

	@When("user click on Eight number")
	public void user_click_on_Eight_number() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
	    Thread.sleep(2000);

	}

	@When("user click on Nine number")
	public void user_click_on_Nine_number() throws Exception {
		browser.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
	    Thread.sleep(2000);

	}

	







		}



