package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test4Fun {
    public static WebDriver driver;

    public void setUp(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), options);
        }
    }
    public static void main(String[] args) throws MalformedURLException {
        Test4Fun test = new Test4Fun();

        for (String browser : new String[]{"chrome", "edge"}) {
            test.setUp(browser);

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

            WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
            username.sendKeys("Admin");

            WebElement password = driver.findElement(By.xpath("//*[@name='txtPassword']"));
            password.sendKeys("Hum@nhrm123");

            WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
            loginBtn.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewPimModule")));

            System.out.println("[" + browser + "] " + driver.getTitle());
            driver.quit();
        }
    }
}


        // WebElement weclomeMsg=driver.findElement(By.xpath("//body/div[1]/div[1]/a[2]"));
        // weclomeMsg.click();

        // WebElement aboutBtn=driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[1]"));
        //aboutBtn.click();
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='welcome-menu']/ul/li[1]/div/div/a")));
        // WebElement closeBtn=driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[1]/div/div/a"));
        //closeBtn.click();

    /*
        WebElement pimBtn = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"));
        pimBtn.click();
        WebElement addEmpBtn = driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='menu_pim_addEmployee']")));
        addEmpBtn.click();

        WebElement addFN = driver.findElement(By.xpath("//input[@name='firstName']"));
        addFN.sendKeys("James");
        WebElement addMdN = driver.findElement(By.xpath("//input[@name='middleName']"));
        addMdN.sendKeys("007");
        WebElement addLN = driver.findElement(By.xpath("//input[@name='lastName']"));
        addLN.sendKeys("Bond");

        WebElement saveBtn = driver.findElement(By.xpath("//input[@value='Save']"));
        saveBtn.click();

        */
