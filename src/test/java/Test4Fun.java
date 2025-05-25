import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test4Fun {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement username= driver.findElement(By.xpath("//*[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//*[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

    }
}
