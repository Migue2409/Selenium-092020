package Miguel.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //tomando el path del driver en el sistema
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe"); //establecer la propiedad del .exe
        WebDriver driver = new ChromeDriver(); //iniciando el driver
        driver.get("https://www.google.com");
    }
}
