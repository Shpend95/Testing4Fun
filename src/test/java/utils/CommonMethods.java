package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;

    public static void launchBrowser() throws IOException {

        switch(ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            case "IE":
                driver=new InternetExplorerDriver();
                break;
            default:
                throw new RuntimeException("Invalid Browser Name");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
}
