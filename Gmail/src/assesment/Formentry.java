package assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Formentry {
	private WebDriver driver;

@Before
public void setUp() {
  driver = new ChromeDriver();
 
}
@After
public void tearDown() {
  driver.quit();
}
@Test
public void untitled() {
  driver.get("https://customer.i-on.in:9443/signUp");
  
  driver.findElement(By.id("name")).click();
  driver.findElement(By.id("name")).sendKeys("sandeep");
  driver.findElement(By.id("SelectSegment")).click();
  {
    WebElement dropdown = driver.findElement(By.id("SelectSegment"));
    dropdown.findElement(By.xpath("//option[. = 'Corporate']")).click();
  }
  driver.findElement(By.id("serviceTypeId")).click();
  {
    WebElement dropdown = driver.findElement(By.id("serviceTypeId"));
    dropdown.findElement(By.xpath("//option[. = 'High Speed Broadband']")).click();
  }
  driver.findElement(By.id("mobile")).click();
  driver.findElement(By.id("mobile")).sendKeys("950950950");
  driver.findElement(By.id("primaryemail")).click();
  driver.findElement(By.id("primaryemail")).sendKeys("adc@gmail.com");
  driver.findElement(By.id("Communicationpincode")).click();
  driver.findElement(By.id("Communicationpincode")).sendKeys("533003");
  driver.findElement(By.id("Communicationarea")).click();
  driver.findElement(By.cssSelector(".ion__information_box")).click();
  driver.findElement(By.id("Communicationbuilding")).click();
  driver.findElement(By.id("Communicationbuilding")).sendKeys("68/12/18");

}
}