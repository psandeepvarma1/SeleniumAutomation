package assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login { public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();

    driver.manage().window().maximize();

    String url = "https://accounts.google.com/signin";

    driver.get(url);

    driver.findElement(By.xpath("identifierId")).click();
    
    driver.findElement(By.xpath("identifierId")).sendKeys("sandeepvarma619@gmail.com");
                   

    driver.findElement(By.xpath("\"password\"")).click();    
          

    driver.findElement(By.xpath("\"password\"")).sendKeys("yourpasswordhere");             

    driver.findElement(By.xpath("\"passwordNext\"")).click(); 
    
    driver.findElement(By.xpath("\":lw\"")).click();
    
    driver.findElement(By.xpath("\":ru\"")).sendKeys("to@gmail.com"); 

    driver.findElement(By.xpath("\":rc\"")).sendKeys("subject"); 
    
    driver.findElement(By.xpath("\":sv\"")).click();
}
}
