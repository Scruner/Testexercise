//package projects;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FourteenthTask {
//
//    public static void main(String[] args) throws AWTException {
//        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
//        WebDriver curentDriver = new ChromeDriver();
//        curentDriver.manage().window().maximize();
//        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        curentDriver.get("https://www.google.com");
//        WebElement firstElement = curentDriver.findElement(By.name("q"));
//        firstElement.sendKeys("software testing help");
//        firstElement.sendKeys(Keys.ENTER);
//        String str = Keys.chord(Keys.CONTROL, Keys.RETURN);
//        curentDriver.findElement(By.partialLinkText("Software Testing Help " +
//                "- A Must Visit Software Testing Portal"))
//                .sendKeys(str);
//// Инициализируем экземпляр класса Robot
//        Robot qurentRobot = new Robot();
//// применяя класс Robot вы легко можете получить необходимый результат если вы знаете нужные комбинации кнопок
//        qurentRobot.keyPress(KeyEvent.VK_CONTROL);
//// тут мы нажимаем ctrl+2
//        qurentRobot.keyPress(KeyEvent.VK_2);
//// как только мы нажмем и отпустим ctrl+2, мы перейдем на вторую вкладку.
//        qurentRobot.keyRelease(KeyEvent.VK_CONTROL);
////если вы хотите снова вернуться к первой вкладке нажмите и отпустите vk_1
//        qurentRobot.keyRelease(KeyEvent.VK_2);
//    }
//}
