package MavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
      
      WebDriver d1;
     
      d1=new ChromeDriver();
    
      d1.get("http://www.leafground.com/");
      
      System.out.println(d1.getTitle());
	  
  }
}
