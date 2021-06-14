//package projects;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//
//public class TwelfthTask {
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//        WebDriver qurentDriver = new ChromeDriver();
//        JavascriptExecutor jscript = (JavascriptExecutor) qurentDriver;
//        qurentDriver.manage().window().maximize();
//        qurentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        qurentDriver.get("https://www.google.com.ua");
//        WebElement qurentElement = qurentDriver.findElement(By.name("q"));
//        qurentElement.sendKeys("SoftwareTestingHelp");
//        qurentElement.sendKeys(Keys.ENTER);
//        jscript.executeScript("window.scrollBy(0,900)");
//    }
//}