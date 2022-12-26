package ibu.edu.ba.seleniumtesting;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {
	private static WebDriver webDriver;
	private static String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/xy/Downloads/chromedriver_win32/chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.rct.uk/";
		
	}

	@After
	public void tearDown() throws Exception {
		webDriver.quit();
	}
	/* 1
	@Test 
	public void buckinghamPalaceTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		webDriver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[3]/div[1]/div[2]/div[1]/div/div/div[4]/div/a/div/img")).click();
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[5]/div[2]/div[2]/div[1]/div/div/div[3]/a/div/img")).click();
		Thread.sleep(2000);
		String title = webDriver.getTitle();
		assertEquals("Highlights of Buckingham Palace", title);
		WebElement emailSubscribe = webDriver.findElement(By.xpath("/html/body/div/div[7]/div/div/div[1]/div/div/form/input[6]"));
		emailSubscribe.sendKeys("adnank@gmail.com");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[7]/div/div/div[1]/div/div/form/button")).click();
		Thread.sleep(2000);
		webDriver.get(baseUrl);
		Thread.sleep(2000);
	}*/
	/* 2
	@Test 
	public void buyTicketWindsorCastleTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		webDriver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div/a/div/img")).click();
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[5]/div[1]/div[2]/div[1]/div/div/div[1]/a/div/img")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div[2]/div/div/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[5]/div[9]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		WebElement adultTickets = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/ul/li[1]/div[2]/div[2]/label/div/div[1]/input"));
		adultTickets.sendKeys("2");
		WebElement youngTickets = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/ul/li[4]/div[2]/div[2]/label/div/div[1]/input"));
		youngTickets.sendKeys("1");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[3]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div[3]/div[5]/div[6]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div/div/div[1]/div[5]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[2]/button")).click();
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/a/img")).click();
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[3]/a")).click();
		Thread.sleep(2000);
		WebElement emailAddress = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[1]/input"));
		emailAddress.sendKeys("adnank@gmail.com");
		WebElement emailAddressConfirm = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[2]/input"));
		emailAddressConfirm.sendKeys("adnank@gmail.com");
		WebElement mobileNumber = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[3]/input"));
		mobileNumber.sendKeys("0603334343");
		Select personTitle = new Select(webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[4]/div/select")));
		personTitle.selectByVisibleText("Mr");
		WebElement firstName = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[5]/div[1]/input"));
		firstName.sendKeys("Adnan");
		WebElement lastName = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[5]/div[2]/input"));
		lastName.sendKeys("Krndzija");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[6]/button")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[1]/button")).click();
		Thread.sleep(4000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]/div/span/span/div/div/button")).click();
		Thread.sleep(2000);
		WebElement countryInput = webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/input"));
		countryInput.sendKeys("Bosnia and Herzegovina");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/a")).click();
		Thread.sleep(2000);
		WebElement address = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[2]/input"));
		address.sendKeys("sarajevo");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/span")).click();
		Thread.sleep(2000);
		WebElement addressLine = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[4]/input"));
		addressLine.clear();
		addressLine.sendKeys("Sarajevo 1");
		WebElement city = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[6]/input"));
		city.clear();
		city.sendKeys("Sarajevo");
		WebElement postalCode = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[7]/input"));
		postalCode.clear();
		postalCode.sendKeys("Sarajevo");
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[8]/button")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[6]/div[2]/label/span")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[7]/button")).click();
		webDriver.get(baseUrl);
		Thread.sleep(3000);
	}*/
	/* 3
	@Test 
	public void royalCollectionSearchTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[4]/a[1]")).click();
		Thread.sleep(5000);
		String textUnderImage = webDriver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[1]/div[2]/div/div/div/div[2]/div/div/a[1]")).getText();
		assertTrue(textUnderImage.contains("The head of Leda"));
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[3]/div/div/div[1]/a/div/img")).click();
		Thread.sleep(2000);
		WebElement search = webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div/div[1]/div/div[5]/div[2]/div[1]/div/div/div/div/form/input"));
		search.sendKeys("Thomas Carlyle");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div/div[1]/div/div[5]/div[2]/div[1]/div/div/div/div/form/ul/li/a/span/span")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div[8]/div/div[1]/div/a/div/img")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div/div[2]/div[1]/div/div[1]/div[3]/div/div/div[4]/ul/li[2]/div[1]/h4/a")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div/div[2]/div[1]/div/div[1]/div[3]/div/div/div[4]/ul/li[2]/div[2]/div[1]/div[2]/div/div/a")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[3]/div/div[1]/div/div[4]/div/div/div/div[3]/a")).click();
		Thread.sleep(2000);
	}*/
	
	/* 4 NE RADIIII
	@Test 
	public void keepInTouchTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[6]/a[1]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[6]/span[2]/ul/li[3]/a")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/input"))
				).sendKeys("adnan@gmail.com");
		WebElement email = webDriver.findElement(By.cssSelector("#textbox-11"));
		email.sendKeys("adnan@gmail.com");
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[3]/div[2]/div/div/span/input")).click();
		Select title = new Select(webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[6]/div[2]/div/select")));
		title.selectByVisibleText("Mr");
		Thread.sleep(1000);
		WebElement firstName = webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[7]/div[2]/input"));
		firstName.sendKeys("Adnan");
		Thread.sleep(1000);
		WebElement lastName = webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[8]/div[2]/input"));
		lastName.sendKeys("Adnan");
		Thread.sleep(1000);
		Select country = new Select(webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[9]/div[2]/div/select")));
		country.selectByVisibleText("Bosnia and Herzegovina");
		Thread.sleep(1000);
		WebElement postalCode = webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[10]/div[2]/input"));
		postalCode.sendKeys("71000");
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[13]/fieldset/div/div/div/div[2]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[15]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[16]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[17]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[19]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[20]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[21]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[22]/fieldset/div/div/div/div[1]/div/span/input")).click();
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[23]/fieldset/div/div/div/div[2]/div/span/input")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/div[1]/div/div/div/div[3]/div[2]/div/div/span/input")).click();
	}*/
	
	/* 5
	@Test 
	public void crownJewelsReviewTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		webDriver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[3]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/a/div/picture/img")).click();
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[4]/div/div/div[1]/div/div[1]/a/div/img")).click();
		Thread.sleep(2000);
		webDriver.navigate().back();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[4]/div/div/div[2]/div/div[1]/a/div/img")).click();
		Thread.sleep(2000);
		webDriver.navigate().back();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[4]/div/div/div[3]/div/div[1]/a/div/img")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[5]/div[2]/div/div[3]/div/div/div[1]/a/picture/img")).click();
		Thread.sleep(2000);
		webDriver.get(baseUrl);
		Thread.sleep(2000);
	}*/
	
	/* 6
	@Test 
	public void resourceMaterialSearchTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[2]/div/div[1]/div[2]/ul/li[9]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[2]/div/div[2]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[2]/div/div[2]/div/div[1]/div/ul/li[2]")).click();
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[2]/div/div[2]/div/ul/li")).click();
		Thread.sleep(2000);
		WebElement searchBar = webDriver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[2]/div/div[1]/div[1]/input"));
		searchBar.sendKeys("A present for a Princess");
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[2]/div/div[1]/div[1]/button")).click();
		Thread.sleep(1000);
		webDriver.get(baseUrl);
		Thread.sleep(2000);
	}*/
	
	/* 7
	@Test 
	public void footerSocialMediaLinksTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[1]/div/div/ul/li[1]/a/img")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[1]/div/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[1]/div/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
	}*/
	/* 8
	@Test 
	public void policyCookiesTCMenuTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[6]/div/div/div[2]/div/div[1]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[4]/div/div/div[1]/div/div[1]/a/div/img")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div/div/div/div[1]")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div/div/div/div[2]/ul/li[15]/div/div[1]/i")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[2]/div/div/div/div/div[2]/ul/li[15]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
	}*/
	
	/* 9
	@Test 
	public void login() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[6]/a[1]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[6]/span[2]/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		WebElement email = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[1]/input"));
		email.sendKeys("adnan@gmail.com");
		Thread.sleep(2000);
		WebElement password = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[2]/input"));
		password.sendKeys("123456789");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button[1]")).click();
		Thread.sleep(2000);
		String errorMessage = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[1]/div")).getText();
		assertTrue(errorMessage.contains("Your e-mail or password were not recognised"));
		Thread.sleep(2000);
	}*/
	
	/* 10
	@Test 
	public void forgotPassword() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[6]/a[1]")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div[1]/ul/li[6]/span[2]/ul/li[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button[2]/span")).click();
		Thread.sleep(2000);
		WebElement email = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/input"));
		email.sendKeys("adnan@gmail.com");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/button")).click();
		Thread.sleep(2000);
		String resetEmailSent = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div")).getText();
		assertTrue(resetEmailSent.contains("reset link"));
		Thread.sleep(2000);
	}*/
	
	/* 11 NE RADIIIII
	@Test 
	public void jobOpportunitiesTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[2]/div/div[1]/div[2]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		//ovdje je problem, kaze da ga ne moze pronaci/locirati
		webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[6]/div[2]/div/div[2]/div/span/a")).click();
		Thread.sleep(2000);
		WebElement firstJob = webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[5]/div[2]/div/div[1]/div/a"));
		firstJob.click();
		Thread.sleep(2000);
		webDriver.navigate().back();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[6]/div[1]/a[2]")).click();
		Thread.sleep(2000);
		WebElement openQ = webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[7]/div/ul/li[2]/h6/a"));
		openQ.click();
		Thread.sleep(2000);
		WebElement closeQ = webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[7]/div/ul/li[2]/h6/a"));
		closeQ.click();
		Thread.sleep(2000);
		WebElement logoLink = webDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a/img"));
		logoLink.click();
		Thread.sleep(2000);
	}*/
	
	/* 12 NE RADIII
	@Test 
	public void contactFormTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div[1]/div/p/button")).click();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("/html/body/div[2]/div[6]/div/div/div[1]/div/div/ul/li[5]/a/span")).click();
		Thread.sleep(2000);
		//OVDJE NE RADI OVAJ SEECT DIO KAD BIRA KOGA CE KONTAKTIRATI
		Select search = new Select(webDriver.findElement(By.xpath("/html/body/div[2]/div[5]/div/div/div[5]/div/div/div/div/div/div/input")));
		search.selectByVisibleText("Marketing");
		Thread.sleep(2000);
		WebElement fullName = webDriver.findElement(By.xpath("/html/body/div/form/div[1]/div/input"));
		fullName.sendKeys("Adnan Adnan");
		Thread.sleep(2000);
		WebElement email = webDriver.findElement(By.xpath("/html/body/div/form/div[2]/div/input"));
		email.sendKeys("adnan@gmail.com");
		Thread.sleep(2000);
		WebElement reason = webDriver.findElement(By.xpath("/html/body/div/form/div[3]/div/input"));
		reason.sendKeys("Adnan marketing");
		Thread.sleep(2000);
		WebElement message = webDriver.findElement(By.xpath("/html/body/div/form/div[4]/div/textarea"));
		message.sendKeys("Hello there");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("/html/body/div/form/div[8]/div[2]/input")).click();
		Thread.sleep(2000);
	}*/
}
