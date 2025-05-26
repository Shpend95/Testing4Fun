import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test4Fun {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement username= driver.findElement(By.xpath("//*[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//*[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn= driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginBtn.click();



        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

       // WebElement weclomeMsg=driver.findElement(By.xpath("//body/div[1]/div[1]/a[2]"));
       // weclomeMsg.click();

       // WebElement aboutBtn=driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[1]"));
        //aboutBtn.click();



      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='welcome-menu']/ul/li[1]/div/div/a")));
       // WebElement closeBtn=driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[1]/div/div/a"));
        //closeBtn.click();

        WebElement  pimBtn=driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
        pimBtn.click();



        WebElement addEmpBtn=driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu_pim_addEmployee']")));
        addEmpBtn.click();







    }
}
