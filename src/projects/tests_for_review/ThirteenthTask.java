//package projects;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class ThirteenthTask {
//
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.drive", "C:\\driver\\chromedriver.exe");
//        WebDriver curentDriver = new ChromeDriver();
//        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        curentDriver.manage().window().maximize();
//        curentDriver.get("https://www.gmail.com/");
//        java.util.List<WebElement> linkList = curentDriver.findElements(By.tagName("a"));
//        System.out.println(linkList.size());
//        for (WebElement thisLink : linkList) {
//            //выводим на экран ссылку http://google.com или https://www.gmail.com
//            System.out.println(qurentLink.getAttribute("href"));
//            //выводим на экран текст ссылки
//            System.out.println(qurentLink.getText());
//        }
//    }
//}