package pulse.longdom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id  = "user_name")
	private WebElement user_name;
	
	@FindBy(id = "user_password")
	private WebElement user_password;
	
	@FindBy(id = "login_type")
	private WebElement submitButton;
	WebDriver driver = null;
	
	public LoginPage(){
		System.setProperty("webdriver.chrome.driver",".\\Browser\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public void loginToApp() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.longdom.com/support/");

		driver.findElement(By.id("user_name")).clear();
		driver.findElement(By.id("user_name")).sendKeys("U5T0363");
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys("chandrika");
		driver.findElement(By.id("log_submit")).click();
	}
	
}

