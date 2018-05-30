package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by lenovo on 2018/5/7.
 */
public class SeleniumUtil {
    private static Logger logger = Logger.getLogger(SeleniumUtil.class);
    //声明Driver
    WebDriver driver = null;
    //识别驱动

    public WebDriver getDriver(String driverType) throws InterruptedException {
        if (driverType.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");

            driver = new ChromeDriver();
            logger.info("启动chrome浏览器");
        } else if (driverType.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("启动FireFox浏览器");
        } else {
            logger.error("找不到对应浏览器");
        }
        driver.manage().window().maximize();
        Thread.sleep(3000);
        return driver;
    }

    //识别一个应元素
    public WebElement findElement(By by) {
        WebElement webElement = null;
        try {
            webElement = driver.findElement(by);
            logger.info("找到对元素");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            logger.error("未找到对应元素");
        }
        return webElement;
    }

    //识别一组元素
    public List<WebElement> findElements(By by) {
        logger.info("找到一组元素");
        return driver.findElements(by);
    }

    //打开网址
    public void url(String url) {
        driver.get(url);
        logger.info("打开网址" + url);
    }

    //输入内容
//    public void sendKeys(By by,String text) {
//        WebElement webElement = findElement(by);
//        webElement.sendKeys(text);
//        logger.info("输入成功");

    public void sendKeys(By by,String text) {
        WebElement element = findElement(by);
        element.clear();
        try {
            element.sendKeys(text);
//            logger.info("在元素"+getLocationByElement(element,">")+"成功输入内容:"+text);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            logger.error("输入内容失败");
        }
    }
    //点击
    public void click(By by) {
        try {
            WebElement webElement = findElement(by);
            webElement.click();
            logger.info("点击成功");
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
            logger.error("点击失败");
        }
    }

    //清除
    public void clear(By by) {
        WebElement webElement = findElement(by);
        webElement.clear();
        logger.info("清除成功");
    }

    //获取文本内容
    public String getText(By by) {
        WebElement webElement = findElement(by);
        String text = webElement.getText();
        logger.info("获取的文本是" + text);
        return text;
    }

    //校验元素是否存在
    public boolean isExist(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            logger.error("页面元素不存在" + by.toString());
        }
        return false;
    }

    //根据顶部title判断当前页面是否是预期页面
    public void assertPage(String expected) {
        String actual = driver.getTitle();
        try {
            Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("预期的页面是:[" + expected + "],实际页面是:[" + actual + "]");
        }
        logger.info("找到预期页面:[" + expected + "])");
    }
    //校验文本是否与预期一致

    public void assertForText(String expected, By by) {
            String actual=findElement(by).getText();
        try {
            Assert.assertEquals(expected, actual);
        } catch (AssertionError e) {
            logger.error("预期文本是:[" + expected + "] 但实际找到了:[" + actual + "]");
            Assert.fail("预期文本是:[" + expected + "] 但实际找到了:[" + actual + "]");
            e.getStackTrace();
        }
        logger.info("找到预期文本:[" + expected + "])");
    }

    //   返回元素的定位值
    public String getLocatorByElement(WebElement webelement, String exceptText) {
        String text = webelement.toString();
        String except = null;
        try {
            except = text.substring(text.indexOf(exceptText) + 1, text.length() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("failed to find the String :  " + exceptText);
        }
        logger.info("返回元素的定位值" + except);
        return except;
    }

    //iframe
    public void iframe(String id) {
        driver.switchTo().frame(id);

    }

    public void iframe() {
        driver.switchTo().defaultContent();

    }

    // 句柄切换
    public void handle() {
//        先获取当前窗口的句柄，
        String current_handle = driver.getWindowHandle();
        //        打开新窗口后获取所有窗口的句柄，
        Set<String> all_handles = driver.getWindowHandles();
        //        通过循环判断是不是当前的窗口句柄，

//        Iterator<String> it = all_handles.iterator();
//        while (it.hasNext()) {
//            if (it.next() == current_handle) {
//                continue;
//            }
//          跳入新窗口
        //  WebDriver new_driver = chrome.switchTo().window(it.next());
        List<String> list =new ArrayList<String>(all_handles);
        driver.switchTo().window(list.get(list.size()-1));
       logger.info("成功切换到新窗口");

//    }
    }
    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素: [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 :[" + by + "]");
        }
        logger.info("找到了元素: [" + by + "]");
    }



}