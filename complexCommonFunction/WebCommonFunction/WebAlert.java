package WebCommonFunction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAlert {

	public WebDriver dirver;
	public  WebAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
}
