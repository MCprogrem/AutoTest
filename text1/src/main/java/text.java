import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by lenovo on 2018/4/23.
 */
public class text {
    public static void main(String[] args) throws InterruptedException {
        //1. 找驱动
        String path = "E:\\chrome&driver\\chrome&driver\\chromedriver.exe";
        //2.设置系统属性(键值对)
       System.setProperty("webdriver.chrome.driver", path);
        //3.实例化一个驱动
        WebDriver chromDriver =new ChromeDriver();
        //4.驱动找对应的页面
        chromDriver.get("E:\\LINUX\\light\\index.html");
        //5.找对应的元素
        WebElement element = chromDriver.findElement(By.className("switch"));
        //6.操作一个元素
        for(int i=1;i<=5;i++){
            Thread.sleep(2000);
            element.click();
        }

    }
}
