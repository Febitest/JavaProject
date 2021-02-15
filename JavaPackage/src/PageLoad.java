import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoad {
public static void main(String[] args) {
//	System.out.println("Load Google Page");
	WebDriver wd=new FirefoxDriver();
	wd.get("https://www.twitter.com");
	
	
}
}
