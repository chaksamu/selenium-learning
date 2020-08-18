import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexplorerDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\g706427\\Desktop\\Work\\DevOps\\Selenium\\chromedriver_win32\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}